package androidx.compose.ui.layout;

import androidx.compose.ui.layout.Placeable;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public interface WindowInsetsRulers {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final WindowInsetsRulers CaptionBar;
        private static final WindowInsetsRulers DisplayCutout;
        private static final WindowInsetsRulers Ime;
        private static final WindowInsetsRulers MandatorySystemGestures;
        private static final WindowInsetsRulers NavigationBars;
        private static final WindowInsetsRulers SafeContent;
        private static final WindowInsetsRulers SafeDrawing;
        private static final WindowInsetsRulers SafeGestures;
        private static final WindowInsetsRulers StatusBars;
        private static final WindowInsetsRulers SystemBars;
        private static final WindowInsetsRulers SystemGestures;
        private static final WindowInsetsRulers TappableElement;
        private static final WindowInsetsRulers Waterfall;

        static {
            WindowInsetsRulersImpl windowInsetsRulersImpl = new WindowInsetsRulersImpl("caption bar");
            CaptionBar = windowInsetsRulersImpl;
            WindowInsetsRulersImpl windowInsetsRulersImpl2 = new WindowInsetsRulersImpl("display cutout");
            DisplayCutout = windowInsetsRulersImpl2;
            WindowInsetsRulersImpl windowInsetsRulersImpl3 = new WindowInsetsRulersImpl("ime");
            Ime = windowInsetsRulersImpl3;
            WindowInsetsRulersImpl windowInsetsRulersImpl4 = new WindowInsetsRulersImpl("mandatory system gestures");
            MandatorySystemGestures = windowInsetsRulersImpl4;
            WindowInsetsRulersImpl windowInsetsRulersImpl5 = new WindowInsetsRulersImpl("navigation bars");
            NavigationBars = windowInsetsRulersImpl5;
            WindowInsetsRulersImpl windowInsetsRulersImpl6 = new WindowInsetsRulersImpl("status bars");
            StatusBars = windowInsetsRulersImpl6;
            SystemBars = new InnermostInsetsRulers("system bars", new WindowInsetsRulers[]{windowInsetsRulersImpl6, windowInsetsRulersImpl5, windowInsetsRulersImpl});
            WindowInsetsRulersImpl windowInsetsRulersImpl7 = new WindowInsetsRulersImpl("system gestures");
            SystemGestures = windowInsetsRulersImpl7;
            WindowInsetsRulersImpl windowInsetsRulersImpl8 = new WindowInsetsRulersImpl("tappable element");
            TappableElement = windowInsetsRulersImpl8;
            WindowInsetsRulersImpl windowInsetsRulersImpl9 = new WindowInsetsRulersImpl("waterfall");
            Waterfall = windowInsetsRulersImpl9;
            SafeDrawing = new InnermostInsetsRulers("safe drawing", new WindowInsetsRulers[]{windowInsetsRulersImpl6, windowInsetsRulersImpl5, windowInsetsRulersImpl, windowInsetsRulersImpl2, windowInsetsRulersImpl3, windowInsetsRulersImpl8});
            SafeGestures = new InnermostInsetsRulers("safe gestures", new WindowInsetsRulers[]{windowInsetsRulersImpl4, windowInsetsRulersImpl7, windowInsetsRulersImpl8, windowInsetsRulersImpl9});
            SafeContent = new InnermostInsetsRulers("safe content", new WindowInsetsRulers[]{windowInsetsRulersImpl6, windowInsetsRulersImpl5, windowInsetsRulersImpl, windowInsetsRulersImpl3, windowInsetsRulersImpl7, windowInsetsRulersImpl4, windowInsetsRulersImpl8, windowInsetsRulersImpl2, windowInsetsRulersImpl9});
        }

        private Companion() {
        }

        public final WindowInsetsRulers getCaptionBar() {
            return CaptionBar;
        }

        public final WindowInsetsRulers getDisplayCutout() {
            return DisplayCutout;
        }

        public final WindowInsetsRulers getIme() {
            return Ime;
        }

        public final WindowInsetsRulers getMandatorySystemGestures() {
            return MandatorySystemGestures;
        }

        public final WindowInsetsRulers getNavigationBars() {
            return NavigationBars;
        }

        public final WindowInsetsRulers getSafeContent() {
            return SafeContent;
        }

        public final WindowInsetsRulers getSafeDrawing() {
            return SafeDrawing;
        }

        public final WindowInsetsRulers getSafeGestures() {
            return SafeGestures;
        }

        public final WindowInsetsRulers getStatusBars() {
            return StatusBars;
        }

        public final WindowInsetsRulers getSystemBars() {
            return SystemBars;
        }

        public final WindowInsetsRulers getSystemGestures() {
            return SystemGestures;
        }

        public final WindowInsetsRulers getTappableElement() {
            return TappableElement;
        }

        public final WindowInsetsRulers getWaterfall() {
            return Waterfall;
        }

        public final WindowInsetsRulers innermostOf(WindowInsetsRulers... windowInsetsRulersArr) {
            return new InnermostInsetsRulers(null, windowInsetsRulersArr);
        }
    }

    WindowInsetsAnimation getAnimation(Placeable.PlacementScope placementScope);

    RectRulers getCurrent();

    RectRulers getMaximum();
}
