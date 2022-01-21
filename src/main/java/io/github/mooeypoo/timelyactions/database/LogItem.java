package io.github.mooeypoo.timelyactions.database;

import java.time.LocalDateTime;

public class LogItem {
	private final String player;
	private final String interval;
	private final LocalDateTime run_time;

	public LogItem(
		String player,
		String interval,
		LocalDateTime run_time
	) {
		this.player = player;
		this.interval = interval;
		this.run_time = run_time;
	}
	
	public String getPlayer() {
		return this.player;
	}
	
	public String getInterval() {
		return this.interval;
	}
	
	public LocalDateTime getRunTime() {
		return this.run_time;
	}
}
