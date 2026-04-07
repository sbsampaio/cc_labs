CC=javac
JAVA=java
ROOT=/home/sbsampaio/cc_labs/labs
ANTLR_PATH=$(ROOT)/tools/antlr-4.13.2-complete.jar
CLASS_PATH_OPTION=-cp .:$(ANTLR_PATH)
ANTLR4=$(JAVA) -jar $(ANTLR_PATH)
GRUN=$(JAVA) $(CLASS_PATH_OPTION) org.antlr.v4.gui.TestRig
GRAMMAR_NAME=Exemplo02
GEN_PATH=parser

all: antlr javac
	@echo "Done."

antlr: $(GRAMMAR_NAME).g
	$(ANTLR4) -no-listener -o $(GEN_PATH) $(GRAMMAR_NAME).g

javac:
	$(CC) $(CLASS_PATH_OPTION) $(GEN_PATH)/*.java

run:
	@cd $(GEN_PATH) && $(GRUN) $(GRAMMAR_NAME) begin -gui $(FILE)

clean:
	@rm -rf $(GEN_PATH)