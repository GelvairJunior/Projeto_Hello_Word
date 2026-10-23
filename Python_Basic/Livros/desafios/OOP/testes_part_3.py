import os
import random
os.system('cls')
class Card:

    suit_names = ['Clubs', 'Diamonds', 'Hearts', 'Spades']
    rank_names = [None, 'Ace', 2, 3, 4, 5, 6, 7, 8, 9, 10, 'Jack', 'Queen', 'King', 'Ace']

    def __init__(self, suit, rank):
        self.suit = suit
        self.rank = rank

    def __str__(self):
        suit_name = Card.suit_names[self.suit]
        rank_name = Card.rank_names[self.rank]
        return f'{suit_name} of {rank_name}'

    def __eq__(self, other):
        return self.suit == other.suit and self.rank == other.rank

    def to_tuple(self):
        return (self.suit, self.rank)

    def __lt__(self, other):
        return self.to_tuple() < other.to_tuple()

    def __le__(self, other):
        return self.to_tuple() <= other.to_tuple()


class Deck:

    def __init__(self, cards):
        self.cards = cards

    def __str__(self):
        res = []
        for card in self.cards:
            res.append(str(card))
        return '\n'.join(res)

    def make_cards():
        cards = []
        for suit in range(4):
            for rank in range(2,15):
                card = Card(suit, rank)
                cards.append(card)
        return cards

    def take_card(self):
        return self.cards.pop()

    def put_card(self, card):
        self.cards.append(card)

    def shuffle(self):
        random.shuffle(self.cards)

    def sort(self):
        self.cards.sort()

    def move_cards(self, other, num):
        for i in range(num):
            card = self.take_card()
            other.put_card(card)


class Hand(Deck):

    def __init__(self, label=''):
        self.label = label
        self.cards = []


class BridgeHand(Hand):

    hcp_dict = {
        'Ace':4,
        'King':3,
        'Queen':2,
        'Jack':1
    }

    def high_card_point_count(self):
        count = 0
        for card in self.cards:
            rank_name = Card.rank_names[card.rank]
            count += BridgeHand.hcp_dict.get(rank_name, 0)
        return count

def find_defining_class(obj, method_name):
    """
    """
    for typ in type(obj).mro():
        if method_name in vars(typ):
            return typ
    return f'Method {method_name} not found'

deck = Deck(Deck.make_cards())
hand1 = Hand('jogador 1')
deck.shuffle()
deck.move_cards(hand1, 7)
print(f'{hand1.label.upper()}\n', hand1, '\n', sep="")
hand2 = BridgeHand('jogador 2')
deck.move_cards(hand2, 7)
print(f'{hand2.label.upper()}\n', hand2, '\n', sep="")
print(hand2.high_card_point_count(), '\n')

hand3 = BridgeHand('jogador 3')
print(find_defining_class(hand3, 'shuffle'))
