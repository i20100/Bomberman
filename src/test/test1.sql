create table orte (´id´ int(11) unsigned NOT NULL auto_increment, 
´plz´ int(11) NOT NULL,
´name´ varchar(60) NOT NULL,
´created´ datetime NOT NULL,

PRIMARY KEY (´íd´)
) ENGINE=innoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=7;

FOREIGN KEY (ort_id) REFERENCES orte (id)
);


INSERT INTRO ´personen´(´vorname´, ´nachname´, ´orte_id´) VALUE(3400, ´Burgdorf´),
INSERT INTRO ´personen´(´vorname´, ´nachname´, ´orte_id´) VALUE(3400, ´Burgdorf´),
INSERT INTRO ´personen´(´vorname´, ´nachname´, ´orte_id´) VALUE(3400, ´Burgdorf´),
INSERT INTRO ´personen´(´vorname´, ´nachname´, ´orte_id´) VALUE(3400, ´Burgdorf´),
INSERT INTRO ´personen´(´vorname´, ´nachname´, ´orte_id´) VALUE
INSERT INTRO ´personen´(´vorname´, ´nachname´, ´orte_id´) VALUE