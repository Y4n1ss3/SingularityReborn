package androidx.compose.material3;

import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DefaultTooltipCaretShape implements Shape {
    public static final int $stable = 0;
    private final long caretSize;

    public /* synthetic */ DefaultTooltipCaretShape(long j, int i, dq dqVar) {
        this((i & 1) != 0 ? TooltipDefaults.INSTANCE.m2781getCaretSizeMYxV2XQ() : j, null);
    }

    @Override // androidx.compose.ui.graphics.Shape
    /* renamed from: createOutline-Pq9zytI */
    public Outline mo283createOutlinePq9zytI(long j, LayoutDirection layoutDirection, Density density) {
        Path Path = AndroidPath_androidKt.Path();
        float mo367toPx0680j_4 = density.mo367toPx0680j_4(DpSize.m7709getWidthD9Ej5fM(this.caretSize));
        float mo367toPx0680j_42 = density.mo367toPx0680j_4(DpSize.m7707getHeightD9Ej5fM(this.caretSize));
        Path.moveTo(0.0f, 0.0f);
        Path.lineTo(mo367toPx0680j_4 / 2.0f, 0.0f);
        Path.lineTo(0.0f, mo367toPx0680j_42);
        Path.lineTo((-mo367toPx0680j_4) / 2.0f, 0.0f);
        Path.close();
        return new Outline.Generic(Path);
    }

    /* renamed from: getCaretSize-MYxV2XQ, reason: not valid java name */
    public final long m1920getCaretSizeMYxV2XQ() {
        return this.caretSize;
    }

    private DefaultTooltipCaretShape(long j) {
        this.caretSize = j;
    }

    public /* synthetic */ DefaultTooltipCaretShape(long j, dq dqVar) {
        this(j);
    }
}
