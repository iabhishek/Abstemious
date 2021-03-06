package com.cunningstunts.abstemious.client.presenter;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Widget;


public class LoggedOutPresenter implements Presenter {
  public interface UI {
    Widget asWidget();
  }

  private UI ui;
  private EventBus eventBus;

  public LoggedOutPresenter(UI ui, EventBus eventBus) {
    this.ui = ui;
    this.eventBus = eventBus;
  }

  @Override
  public void go(HasWidgets container) {
    container.clear();
    container.add(ui.asWidget());
  }

}
