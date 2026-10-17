package androidx.compose.ui.focus;

import androidx.compose.ui.geometry.Rect;
import defpackage.er;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface FocusProperties {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final Rect UnsetFocusRect = new Rect(Float.NaN, Float.NaN, Float.NaN, Float.NaN);

        private Companion() {
        }

        public final Rect getUnsetFocusRect() {
            return UnsetFocusRect;
        }
    }

    boolean getCanFocus();

    default FocusRequester getDown() {
        return FocusRequester.Companion.getDefault();
    }

    default FocusRequester getEnd() {
        return FocusRequester.Companion.getDefault();
    }

    default ky getEnter() {
        return FocusProperties$enter$1.INSTANCE;
    }

    default ky getExit() {
        return FocusProperties$exit$1.INSTANCE;
    }

    default Rect getFocusRect() {
        return Companion.getUnsetFocusRect();
    }

    default FocusRequester getLeft() {
        return FocusRequester.Companion.getDefault();
    }

    default FocusRequester getNext() {
        return FocusRequester.Companion.getDefault();
    }

    default ky getOnEnter() {
        return FocusProperties$onEnter$1.INSTANCE;
    }

    default ky getOnExit() {
        return FocusProperties$onExit$1.INSTANCE;
    }

    default FocusRequester getPrevious() {
        return FocusRequester.Companion.getDefault();
    }

    default FocusRequester getRight() {
        return FocusRequester.Companion.getDefault();
    }

    default FocusRequester getStart() {
        return FocusRequester.Companion.getDefault();
    }

    default FocusRequester getUp() {
        return FocusRequester.Companion.getDefault();
    }

    void setCanFocus(boolean z);

    @er
    default void setEnter(ky kyVar) {
        ky usingEnterExitScope;
        usingEnterExitScope = FocusPropertiesKt.toUsingEnterExitScope(kyVar);
        setOnEnter(usingEnterExitScope);
    }

    @er
    default void setExit(ky kyVar) {
        ky usingEnterExitScope;
        usingEnterExitScope = FocusPropertiesKt.toUsingEnterExitScope(kyVar);
        setOnExit(usingEnterExitScope);
    }

    static /* synthetic */ void getEnter$annotations() {
    }

    static /* synthetic */ void getExit$annotations() {
    }

    default void setDown(FocusRequester focusRequester) {
    }

    default void setEnd(FocusRequester focusRequester) {
    }

    default void setFocusRect(Rect rect) {
    }

    default void setLeft(FocusRequester focusRequester) {
    }

    default void setNext(FocusRequester focusRequester) {
    }

    default void setOnEnter(ky kyVar) {
    }

    default void setOnExit(ky kyVar) {
    }

    default void setPrevious(FocusRequester focusRequester) {
    }

    default void setRight(FocusRequester focusRequester) {
    }

    default void setStart(FocusRequester focusRequester) {
    }

    default void setUp(FocusRequester focusRequester) {
    }
}
