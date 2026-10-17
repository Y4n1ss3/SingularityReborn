package androidx.compose.animation;

import defpackage.dq;
import defpackage.q10;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public abstract class EnterTransition {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final EnterTransition None = new EnterTransitionImpl(new TransitionData(null, null, null, null, null, false, null, 127, null));

    public /* synthetic */ EnterTransition(dq dqVar) {
        this();
    }

    public boolean equals(Object obj) {
        return (obj instanceof EnterTransition) && q10.b(((EnterTransition) obj).getData$animation(), getData$animation());
    }

    public abstract TransitionData getData$animation();

    public int hashCode() {
        return getData$animation().hashCode();
    }

    public final EnterTransition plus(EnterTransition enterTransition) {
        Fade fade = enterTransition.getData$animation().getFade();
        if (fade == null) {
            fade = getData$animation().getFade();
        }
        Slide slide = enterTransition.getData$animation().getSlide();
        if (slide == null) {
            slide = getData$animation().getSlide();
        }
        ChangeSize changeSize = enterTransition.getData$animation().getChangeSize();
        if (changeSize == null) {
            changeSize = getData$animation().getChangeSize();
        }
        Scale scale = enterTransition.getData$animation().getScale();
        if (scale == null) {
            scale = getData$animation().getScale();
        }
        Veil veil = enterTransition.getData$animation().getVeil();
        if (veil == null) {
            veil = getData$animation().getVeil();
        }
        Map<TransitionEffectKey<?>, TransitionEffect> effectsMap = getData$animation().getEffectsMap();
        Map<TransitionEffectKey<?>, TransitionEffect> effectsMap2 = enterTransition.getData$animation().getEffectsMap();
        effectsMap.getClass();
        effectsMap2.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(effectsMap);
        linkedHashMap.putAll(effectsMap2);
        return new EnterTransitionImpl(new TransitionData(fade, slide, changeSize, scale, veil, false, linkedHashMap, 32, null));
    }

    public String toString() {
        if (equals(None)) {
            return "EnterTransition.None";
        }
        TransitionData data$animation = getData$animation();
        StringBuilder sb = new StringBuilder("EnterTransition: \nFade - ");
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
        return sb.toString();
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        public final EnterTransition getNone() {
            return EnterTransition.None;
        }

        private Companion() {
        }
    }

    private EnterTransition() {
    }
}
