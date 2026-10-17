package androidx.compose.animation;

import defpackage.dq;
import defpackage.q10;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public abstract class ExitTransition {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final ExitTransition KeepUntilTransitionsFinished;
    private static final ExitTransition None;

    static {
        dq dqVar = null;
        Fade fade = null;
        Slide slide = null;
        ChangeSize changeSize = null;
        Scale scale = null;
        Veil veil = null;
        Map map = null;
        None = new ExitTransitionImpl(new TransitionData(fade, slide, changeSize, scale, veil, false, map, 127, dqVar));
        KeepUntilTransitionsFinished = new ExitTransitionImpl(new TransitionData(fade, slide, changeSize, scale, veil, true, map, 95, dqVar));
    }

    public /* synthetic */ ExitTransition(dq dqVar) {
        this();
    }

    public boolean equals(Object obj) {
        return (obj instanceof ExitTransition) && q10.b(((ExitTransition) obj).getData$animation(), getData$animation());
    }

    public abstract TransitionData getData$animation();

    public int hashCode() {
        return getData$animation().hashCode();
    }

    public final ExitTransition plus(ExitTransition exitTransition) {
        Fade fade = exitTransition.getData$animation().getFade();
        if (fade == null) {
            fade = getData$animation().getFade();
        }
        Slide slide = exitTransition.getData$animation().getSlide();
        if (slide == null) {
            slide = getData$animation().getSlide();
        }
        ChangeSize changeSize = exitTransition.getData$animation().getChangeSize();
        if (changeSize == null) {
            changeSize = getData$animation().getChangeSize();
        }
        Scale scale = exitTransition.getData$animation().getScale();
        if (scale == null) {
            scale = getData$animation().getScale();
        }
        Veil veil = exitTransition.getData$animation().getVeil();
        if (veil == null) {
            veil = getData$animation().getVeil();
        }
        boolean z = exitTransition.getData$animation().getHold() || getData$animation().getHold();
        Map<TransitionEffectKey<?>, TransitionEffect> effectsMap = getData$animation().getEffectsMap();
        Map<TransitionEffectKey<?>, TransitionEffect> effectsMap2 = exitTransition.getData$animation().getEffectsMap();
        effectsMap.getClass();
        effectsMap2.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(effectsMap);
        linkedHashMap.putAll(effectsMap2);
        return new ExitTransitionImpl(new TransitionData(fade, slide, changeSize, scale, veil, z, linkedHashMap));
    }

    public String toString() {
        if (equals(None)) {
            return "ExitTransition.None";
        }
        if (equals(KeepUntilTransitionsFinished)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        TransitionData data$animation = getData$animation();
        StringBuilder sb = new StringBuilder("ExitTransition: \nFade - ");
        Fade fade = data$animation.getFade();
        sb.append(fade != null ? fade.toString() : null);
        sb.append(",\nSlide - ");
        Slide slide = data$animation.getSlide();
        sb.append(slide != null ? slide.toString() : null);
        sb.append(",\nShrink - ");
        ChangeSize changeSize = data$animation.getChangeSize();
        sb.append(changeSize != null ? changeSize.toString() : null);
        sb.append(",\nScale - ");
        Scale scale = data$animation.getScale();
        sb.append(scale != null ? scale.toString() : null);
        sb.append(",\nKeepUntilTransitionsFinished - ");
        sb.append(data$animation.getHold());
        return sb.toString();
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        public final ExitTransition getKeepUntilTransitionsFinished$animation() {
            return ExitTransition.KeepUntilTransitionsFinished;
        }

        public final ExitTransition getNone() {
            return ExitTransition.None;
        }

        private Companion() {
        }
    }

    private ExitTransition() {
    }
}
