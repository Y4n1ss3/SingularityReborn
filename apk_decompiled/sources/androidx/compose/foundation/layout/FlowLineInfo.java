package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.Dp;
import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FlowLineInfo {
    public static final int $stable = 8;
    private int lineIndex;
    private float maxCrossAxisSize;
    private float maxMainAxisSize;
    private int positionInLine;

    public /* synthetic */ FlowLineInfo(int i, int i2, float f, float f2, int i3, dq dqVar) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? Dp.m7611constructorimpl(0.0f) : f, (i3 & 8) != 0 ? Dp.m7611constructorimpl(0.0f) : f2, null);
    }

    public final int getLineIndex$foundation_layout() {
        return this.lineIndex;
    }

    /* renamed from: getMaxCrossAxisSize-D9Ej5fM$foundation_layout, reason: not valid java name */
    public final float m695getMaxCrossAxisSizeD9Ej5fM$foundation_layout() {
        return this.maxCrossAxisSize;
    }

    /* renamed from: getMaxMainAxisSize-D9Ej5fM$foundation_layout, reason: not valid java name */
    public final float m696getMaxMainAxisSizeD9Ej5fM$foundation_layout() {
        return this.maxMainAxisSize;
    }

    public final int getPositionInLine$foundation_layout() {
        return this.positionInLine;
    }

    public final void setLineIndex$foundation_layout(int i) {
        this.lineIndex = i;
    }

    /* renamed from: setMaxCrossAxisSize-0680j_4$foundation_layout, reason: not valid java name */
    public final void m697setMaxCrossAxisSize0680j_4$foundation_layout(float f) {
        this.maxCrossAxisSize = f;
    }

    /* renamed from: setMaxMainAxisSize-0680j_4$foundation_layout, reason: not valid java name */
    public final void m698setMaxMainAxisSize0680j_4$foundation_layout(float f) {
        this.maxMainAxisSize = f;
    }

    public final void setPositionInLine$foundation_layout(int i) {
        this.positionInLine = i;
    }

    /* renamed from: update-4j6BHR0$foundation_layout, reason: not valid java name */
    public final void m699update4j6BHR0$foundation_layout(int i, int i2, float f, float f2) {
        this.lineIndex = i;
        this.positionInLine = i2;
        this.maxMainAxisSize = f;
        this.maxCrossAxisSize = f2;
    }

    private FlowLineInfo(int i, int i2, float f, float f2) {
        this.lineIndex = i;
        this.positionInLine = i2;
        this.maxMainAxisSize = f;
        this.maxCrossAxisSize = f2;
    }

    public /* synthetic */ FlowLineInfo(int i, int i2, float f, float f2, dq dqVar) {
        this(i, i2, f, f2);
    }
}
