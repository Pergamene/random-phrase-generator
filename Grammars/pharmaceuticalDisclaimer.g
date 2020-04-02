Submission for input grammar file assignment. This grammar file is for a randomly generated pharmaceutical disclaimer.
Submitted by Jeremy Wilcock (U0927340)
Version: November 30th, 2015

{
<start>
<drugName> is <drugCategory> prescribed for treating <condition> and <condition>. Common side effects include <listofCommonSideEffects>, and <commonSideEffect>. Recommended dose is <dosage> taken <dosageInterval>. Drug interactions include <listofDrugInteractions> and <drugInteraction>. There are no adequate studies in pregnant women. It is not known if this drug is secreted in breast milk. This medication should not be given to <dontGiveTo> as a rare but potentially dangerous side effect may occur. In studies, a small percentage of <classOfPersons> (<smallPercentage>) taking this medication developed <wierdSideEffect>. Less serious side effects may include: <listOfLessSeriousSideEffects> and <lessSeriousSideEffect>. This medication may <mightHappen>. Tell your doctor right away if you have any serious side effects, including: <seriousSideEffects> or <seriousSideEffect>. Rarely, <theLuckyOnes> may have <verySeriousSideEffect> while using this medication. Caregivers/parents should also be watchful for this serious side effect in the patient. Ask your doctor or pharmacist for more details.
<drugName> is <drugCategory> prescribed for treating <condition>. Common side effects include <listofCommonSideEffects>, and <commonSideEffect>. Recommended dosage is <dosage> taken <dosageInterval> except on <holiday>, then dosage should be <crazyDosage> taken <crazyDosageInterval>. Drug interactions include <listofDrugInteractions> and <drugInteraction>. This medication should not be given to <dontGiveTo> as a rare but potentially dangerous side effect of <seriousSideEffect> may occur. In studies, a small percentage of <classOfPersons> (<smallPercentage>) taking this medication developed <wierdSideEffect>. Less serious side effects may include: <listOfLessSeriousSideEffects> and <lessSeriousSideEffect>. This medication may <mightHappen>. Tell your doctor right away if you have any serious side effects, including: <seriousSideEffects> or <seriousSideEffect>. Rarely, <theLuckyOnes> may have <verySeriousSideEffect> while using this medication. Ask your doctor or pharmacist for more details.
}

List of made up drugs. Most from tv shows or movies. Culled from https://en.wikipedia.org/wiki/List_of_fictional_medicines_and_drugs
{
<drugName>
Stupidoxa
Moretrin
Adravil
Chamalla
Charlanta
Cloveritol
Cordrazine
Cryostim
Dioxnyl
Doloxan
Digitalin
Focusyn
Hibernol
Hydra
Hydromel
Isoprovalyn
Metazine
Nappien
Phalanx
Plomox
Prozium
Repressitol
Serisone
Teamocil
Zombrex
}

List of drug categories. Culled from https://quizlet.com/4175901/common-drug-classifications-flash-cards/
{
<drugCategory>
an analgesic
an anesthetic
an antacid medication
an antiarthritic
an antibacterial & antiseptic
an antifungal
a sulfamide
a urinary antibacterial
an antibiotic
an antidote to sleep deprivation
an anti-inflammatory
a steroid
a nonsteroidal anti-inflammatory drug (NSAID)
an antispasmodic
a bronchodilator
a cardiovascular preparation
an antiarrhythmic
an antihypertensive
a vasodilator
a vasopressor
a contraceptive
a decongestant
a dermatological
a dietary supplement
a diuretic
an emetic
a geriatric
a germicide
a hematonic
a laxative
a muscle relaxant
an ophthalmic
a sedative
a tranquilizer
a selective serotonin reuptake inhibitors (SSRI)
a bunch of stuff scrapped off the floor of a gym locker room
}

List of common conditions. Most culled from http://www.ranker.com/list/list-of-common-diseases-most-common-illnesses/diseases-and-medications-info
{
<condition>
Acne
ADD
ADHD
OCD
ODD
Sensory Processing Disorder
Agoraphobia
Motion Sickness
Albinism
Alcohol Dependence
Anemia
Ankle Dislocation
Anxiety
Aphasia
Arsenic Poisoning
Arthritis
Asthma
Athlete�s Foot
Altitude Sickness
Back Pain
Bad Breath
Bed Wetting
Canker Sores
High Cholesterol
Dandruff
Dyslexia
Dermatitis
Epilepsy
Fibromyalgia
Gallstones
Gout
Gingivitis
Head Lice
Headache
Heartburn
Hives
Hyperglycemia
Hypertension
Hyperthyroidism
Hypothyroidism
Iron Deficiency Anemia
Irritable Bowel Syndrome
Itching
Joint Pain
Kidney Stone
Malaria
Memory Loss
Migrane
Muscle Cramps
General Fatigue
Neck Pain
Osteoporosis
Peptic Ulcer
Post-nasl Drip
Restless Leg Syndrome
Ringworm
Sinusitis
Staph Infection
Sunburn
Tennis Elbow
Tooth Decay
Ulcers
Vertigo
}

Builder for list of common side effects
{
<listofCommonSideEffects>
<commonSideEffect>
<listofCommonSideEffects>, <commonSideEffect>
}

List of common side effects. Some real, some not.
{
<commonSideEffect>
nervousness
agitation
anxiety
sleep problems (insomnia)
stomach pain
loss of appetite
weight loss
nausea
vomiting
dizziness
palpitations
headache
vision problems
increased heart rate
increased blood pressure
sweating
skin rash
psychosis
numbness
tingling
cold feeling in hands or feet
bleeding eyeballs
inability to stop blinking very fast
speaking in tongues
spontaneous moshing
driving while asleep
contemplating why people contemplate
spiritual ascension
sense of overwhelming giddiness
acting like a 2 year old but only while eating
}

{
<dosage>
5mg
10mg
25mg
50mg
a whole bottle
}

{
<crazyDosage>
1 pound
12 kg
a handfull
a whole bottle
}

{
<dosageInterval>
twice daily
three times daily
once weekly
as needed
}

{
<crazyDosageInterval>
every 13 minutes
every hour
whenever driving
every time you sneeze
}

Builder for list of interactions
{
<listofDrugInteractions>
<drugInteraction>
<listofDrugInteractions>, <drugInteraction>
}

{
<drugInteraction>
caffeine
monoamine oxidase inhibitors (MAOIs)
water
sugar
soap
pop rocks
aspirin
heroin
bath salts
}

{
<dontGiveTo>
children under the age of 2
monkeys
wombats
monks
Irish pub owners
people with a fear of Irish pub owners
}

{
<smallPercentage>
1%
2%
3%
}

{
<classOfPersons>
men
women
politicians
street performers
actors
musicians
mimes
astronauts
cheerleaders
}

{
<wierdSideEffect>
an ability to walk through walls
a spoon shaped horn projecting from the forehead
upside-down vision
permanently locked knees
permanently locked elbows
extremely flammable skin
an allergy to air
gills behind the ears
x-ray vision
an addiction to marshmallows
under-exposed negatives from a vintage Hasselblad 500C/M camera
}

{
<listOfLessSeriousSideEffects>
<lessSeriousSideEffect>
<listOfLessSeriousSideEffects>, <lessSeriousSideEffect>
}

{
<lessSeriousSideEffect>
spontaneous dancing
uncontrollable laughter
bleeding nipples
hair growth on one or both eyeballs
an insatiable desire to draw kittens
thoughts of pizza
an inability to cease changing majors
an ability to do the chicken dance faster than humanly possible
a fascination with the mating ritual of snails
}

{
<mightHappen>
raise your blood pressure
lower your blood pressure
raise your cholesterol
lower your cholesterol
cause you to question reality
cause you to question your life choices
rock your world
cause unbearable pain
destroy you
just be the worst thing we've ever invented
cost more than it's worth
be laced with LSD
cause you to burst out in song any time someone blesses food
}

{
<seriousSideEffects>
<seriousSideEffect>
<seriousSideEffects>, <seriousSideEffect>
}

{
<seriousSideEffect>
numbness
pain
skin color change
sensitivity to temperature in the fingers/toes
irregular heartbeat
mental/mood/behavior changes (such as agitation, aggression, mood swings, abnormal thoughts, thoughts of suicide)
uncontrolled muscle movements (such as twitching, shaking)
sudden outbursts of words/sounds that are hard to control
vision changes (such as blurred vision)
projectile vomiting
explosive lactation
levitation
spontaneous combustion
a beachball-sized growth on one or both feet
brittle teeth
}

{
<theLuckyOnes>
men (including young boys and teens)
women (including young girls and teens)
dogs (including puppies)
cats (including kittens)
birds
bats
hyenas
that one guy from Friends with the messy hair
}

{
<verySeriousSideEffect>
visions of the apocalypse
an overwhelming urge to write bad poetry
a need to drink the blood of a virgin
changes to speech such that talking resembles the cookie monster
a third nipple
blindness
}

{
<holiday>
easter
thanksgiving
christmas
spring or fall break
finals week
the day you get your grades
the weekends
}