.ONESHELL:
document=paper
all: clean
	arara $(document).tex
	xdg-open $(document).pdf
clean:
	fd -d 1 -t f ".log|.aux|.dvi|.lof|.toc|.lot|.bbl|.bcf|.out|.blg|.brf|.spl|.brf|.nlg|.nlo|.nls|.glo|.glg|.gls|.ilg|.ind|.idx|.ist|.run|.synctex" .\
		| xargs rm -f
