package androidx.compose.animation;

import defpackage.dq;
import defpackage.kp0;
import defpackage.q10;
import defpackage.vt;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TransitionData {
    public static final int $stable = 0;
    private final ChangeSize changeSize;
    private final Map<TransitionEffectKey<?>, TransitionEffect> effectsMap;
    private final Fade fade;
    private final boolean hold;
    private final Scale scale;
    private final Slide slide;
    private final Veil veil;

    public /* synthetic */ TransitionData(Fade fade, Slide slide, ChangeSize changeSize, Scale scale, Veil veil, boolean z, Map map, int i, dq dqVar) {
        this((i & 1) != 0 ? null : fade, (i & 2) != 0 ? null : slide, (i & 4) != 0 ? null : changeSize, (i & 8) != 0 ? null : scale, (i & 16) != 0 ? null : veil, (i & 32) != 0 ? false : z, (i & 64) != 0 ? vt.d : map);
    }

    public static /* synthetic */ TransitionData copy$default(TransitionData transitionData, Fade fade, Slide slide, ChangeSize changeSize, Scale scale, Veil veil, boolean z, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            fade = transitionData.fade;
        }
        if ((i & 2) != 0) {
            slide = transitionData.slide;
        }
        if ((i & 4) != 0) {
            changeSize = transitionData.changeSize;
        }
        if ((i & 8) != 0) {
            scale = transitionData.scale;
        }
        if ((i & 16) != 0) {
            veil = transitionData.veil;
        }
        if ((i & 32) != 0) {
            z = transitionData.hold;
        }
        if ((i & 64) != 0) {
            map = transitionData.effectsMap;
        }
        boolean z2 = z;
        Map map2 = map;
        Veil veil2 = veil;
        ChangeSize changeSize2 = changeSize;
        return transitionData.copy(fade, slide, changeSize2, scale, veil2, z2, map2);
    }

    public final Fade component1() {
        return this.fade;
    }

    public final Slide component2() {
        return this.slide;
    }

    public final ChangeSize component3() {
        return this.changeSize;
    }

    public final Scale component4() {
        return this.scale;
    }

    public final Veil component5() {
        return this.veil;
    }

    public final boolean component6() {
        return this.hold;
    }

    public final Map<TransitionEffectKey<?>, TransitionEffect> component7() {
        return this.effectsMap;
    }

    public final TransitionData copy(Fade fade, Slide slide, ChangeSize changeSize, Scale scale, Veil veil, boolean z, Map<TransitionEffectKey<?>, ? extends TransitionEffect> map) {
        return new TransitionData(fade, slide, changeSize, scale, veil, z, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransitionData)) {
            return false;
        }
        TransitionData transitionData = (TransitionData) obj;
        return q10.b(this.fade, transitionData.fade) && q10.b(this.slide, transitionData.slide) && q10.b(this.changeSize, transitionData.changeSize) && q10.b(this.scale, transitionData.scale) && q10.b(this.veil, transitionData.veil) && this.hold == transitionData.hold && q10.b(this.effectsMap, transitionData.effectsMap);
    }

    public final ChangeSize getChangeSize() {
        return this.changeSize;
    }

    public final Map<TransitionEffectKey<?>, TransitionEffect> getEffectsMap() {
        return this.effectsMap;
    }

    public final Fade getFade() {
        return this.fade;
    }

    public final boolean getHold() {
        return this.hold;
    }

    public final Scale getScale() {
        return this.scale;
    }

    public final Slide getSlide() {
        return this.slide;
    }

    public final Veil getVeil() {
        return this.veil;
    }

    public int hashCode() {
        Fade fade = this.fade;
        int hashCode = (fade == null ? 0 : fade.hashCode()) * 31;
        Slide slide = this.slide;
        int hashCode2 = (hashCode + (slide == null ? 0 : slide.hashCode())) * 31;
        ChangeSize changeSize = this.changeSize;
        int hashCode3 = (hashCode2 + (changeSize == null ? 0 : changeSize.hashCode())) * 31;
        Scale scale = this.scale;
        int hashCode4 = (hashCode3 + (scale == null ? 0 : scale.hashCode())) * 31;
        Veil veil = this.veil;
        return this.effectsMap.hashCode() + kp0.c((hashCode4 + (veil != null ? veil.hashCode() : 0)) * 31, 31, this.hold);
    }

    public String toString() {
        return "TransitionData(fade=" + this.fade + ", slide=" + this.slide + ", changeSize=" + this.changeSize + ", scale=" + this.scale + ", veil=" + this.veil + ", hold=" + this.hold + ", effectsMap=" + this.effectsMap + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TransitionData(Fade fade, Slide slide, ChangeSize changeSize, Scale scale, Veil veil, boolean z, Map<TransitionEffectKey<?>, ? extends TransitionEffect> map) {
        this.fade = fade;
        this.slide = slide;
        this.changeSize = changeSize;
        this.scale = scale;
        this.veil = veil;
        this.hold = z;
        this.effectsMap = map;
    }

    public TransitionData() {
        this(null, null, null, null, null, false, null, 127, null);
    }
}
