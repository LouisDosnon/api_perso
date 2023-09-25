clean:
	chmod +x ./gradlew
	./gradlew clean

build:
	chmod +x ./gradlew
	tree /usr
	./gradlew build

run:
	chmod +x ./gradlew
	./gradlew bootrun