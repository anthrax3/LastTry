package org.egordorichev.lasttry.game.state;

import org.egordorichev.lasttry.core.context.Context;

public interface GameState {
	/**
	 * Called when this screen becomes the current screen for a {@link Game}.
	 */
	default void show() {
	}

	/**
	 * Called when this screen is no longer the current screen for a {@link Game}.
	 */
	default void hide() {
	}

	void load(Context rootContext);

	/**
	 * Update with the game context
	 */
	void update(Context context, float deltaT);

	/**
	 * Called when the screen should render itself.
	 *
	 * @param context the context.
	 */
	void render(Context context);

	/**
	 * @see ApplicationListener#resize(int, int)
	 */
	default void resize(int width, int height) {
	}

	/**
	 * @see ApplicationListener#pause()
	 */
	default void pause() {
	}

	/**
	 * @see ApplicationListener#resume()
	 */
	default void resume() {
	}
}