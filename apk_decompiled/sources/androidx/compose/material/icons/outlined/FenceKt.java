package androidx.compose.material.icons.outlined;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.bv;
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.kp0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FenceKt {
    private static ImageVector _fence;

    public static final ImageVector getFence(Icons.Outlined outlined) {
        ImageVector imageVector = _fence;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Fence", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder w = kp0.w(21.0f, 12.0f, -2.0f, -2.0f, 7.0f);
        w.lineToRelative(-3.0f, -3.0f);
        w.lineToRelative(-2.0f, 2.0f);
        w.lineToRelative(-2.0f, -2.0f);
        w.lineToRelative(-2.0f, 2.0f);
        w.lineTo(8.0f, 4.0f);
        kf0.u(w, 5.0f, 7.0f, 3.0f, 3.0f);
        uf.s(w, 2.0f, 2.0f, 2.0f, 3.0f);
        r6.D(w, 2.0f, 2.0f, 4.0f, 14.0f);
        r6.D(w, -4.0f, 2.0f, -2.0f, -2.0f);
        kf0.n(w, -2.0f, 21.0f, 16.0f, 6.83f);
        fc.u(w, 1.0f, 1.0f, 10.0f, -2.0f);
        w.verticalLineTo(7.83f);
        gy.B(w, 0.41f, -0.41f, 16.0f, 6.83f);
        w.moveTo(12.0f, 6.83f);
        w.lineToRelative(0.59f, 0.59f);
        fc.t(w, 13.0f, 7.83f, 10.0f, -2.0f);
        w.verticalLineTo(7.83f);
        gy.B(w, 0.41f, -0.41f, 12.0f, 6.83f);
        bv.y(w, 11.0f, 14.0f, -2.0f, 2.0f);
        kf0.n(w, 2.0f, 11.0f, 13.0f, 16.0f);
        fc.y(w, 2.0f, -2.0f, -2.0f, 13.0f);
        w.moveTo(7.0f, 7.83f);
        w.lineToRelative(1.0f, -1.0f);
        w.lineToRelative(0.59f, 0.59f);
        uf.u(w, 9.0f, 7.83f, 10.0f, 7.0f);
        k4.D(w, 7.83f, 7.0f, 12.0f, 2.0f);
        gy.s(w, 2.0f, 7.0f, 12.0f);
        k4.C(w, 7.0f, 16.0f, 2.0f, 2.0f);
        bv.s(w, 7.0f, 16.0f, 17.0f, 18.0f);
        bv.l(w, -2.0f, -2.0f, 2.0f, 18.0f);
        k4.C(w, 17.0f, 14.0f, -2.0f, -2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.i(w, 2.0f, 14.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _fence = build;
        build.getClass();
        return build;
    }
}
