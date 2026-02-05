# Problem scenario:

Suppose we have three types of characters in a GameApp:

1. **Knight:** Attacks with a sword; uses 3 strategies to defend (shield, dodge, magic barrier)
2. **Wizard:** Casts spells; uses magic barrier to defend
3. **Archer:** Shoots arrows; uses dodge to to defend

### Implement two types of Strategy:
A.  DefenseStrategy
1. Shield
2. Dodge
3. CreateMagic

B.  AttackStrategy
1.  CastSpell
2.  ShootArrow
3.  SwingSword  

# UML Class Diagram
<img width="1988" height="1383" alt="strategyPattern UML" src="https://github.com/user-attachments/assets/3f2830ce-546b-406b-9be0-35fa2e6f7a8a" />

# Components

- **AttackStrategy (Interface):** Defines a common interface for all attack behaviors.
- **DefenseStrategy (Interface):** Defines a common interface for all defense behaviors.
- **SwingSword, CastSpell, and ShootArrow (Concrete Attack Strategies):** Implements attack strategies
- **Shield, Dodge, MagicBarrier (Concrete Defense Strategies):** Implements defense strategies
- **Character (Context Class):** Delegates attack and defense behavior to the assigned strategies
- **GameApp (Client Class):** Creates characters and assigns appropriate strategies
