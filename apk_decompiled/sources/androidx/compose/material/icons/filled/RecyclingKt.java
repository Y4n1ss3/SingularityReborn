package androidx.compose.material.icons.filled;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.af0;
import defpackage.bv;
import defpackage.gy;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RecyclingKt {
    private static ImageVector _recycling;

    public static final ImageVector getRecycling(Icons.Filled filled) {
        ImageVector imageVector = _recycling;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Recycling", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(5.77f, 7.15f, 7.2f, 4.78f);
        i.lineToRelative(1.03f, -1.71f);
        i.curveToRelative(0.39f, -0.65f, 1.33f, -0.65f, 1.72f, 0.0f);
        i.lineToRelative(1.48f, 2.46f);
        i.lineToRelative(-1.23f, 2.06f);
        r6.C(i, 9.2f, 9.21f, 5.77f, 7.15f);
        i.moveTo(21.72f, 12.97f);
        i.lineToRelative(-1.6f, -2.66f);
        i.lineToRelative(-3.46f, 2.0f);
        i.lineTo(18.87f, 16.0f);
        i.horizontalLineTo(20.0f);
        i.curveToRelative(0.76f, 0.0f, 1.45f, -0.43f, 1.79f, -1.11f);
        i.curveTo(21.93f, 14.61f, 22.0f, 14.31f, 22.0f, 14.0f);
        i.curveTo(22.0f, 13.64f, 21.9f, 13.29f, 21.72f, 12.97f);
        af0.l(i, 16.0f, 21.0f, 1.5f);
        i.curveToRelative(0.76f, 0.0f, 1.45f, -0.43f, 1.79f, -1.11f);
        r6.w(i, 20.74f, 17.0f, 16.0f, -2.0f);
        i.lineToRelative(-4.0f, 4.0f);
        uf.x(i, 4.0f, 4.0f, 21.0f);
        i.moveTo(10.0f, 17.0f);
        i.horizontalLineTo(5.7f);
        i.lineToRelative(-0.84f, 1.41f);
        i.curveToRelative(-0.3f, 0.5f, -0.32f, 1.12f, -0.06f, 1.65f);
        i.lineToRelative(0.0f, 0.0f);
        i.curveTo(5.08f, 20.63f, 5.67f, 21.0f, 6.32f, 21.0f);
        bv.s(i, 10.0f, 17.0f, 6.12f, 14.35f);
        i.lineToRelative(1.73f, 1.04f);
        i.lineTo(6.48f, 9.9f);
        i.lineTo(1.0f, 11.27f);
        i.lineToRelative(1.7f, 1.02f);
        i.lineToRelative(-0.41f, 0.69f);
        i.curveToRelative(-0.35f, 0.59f, -0.38f, 1.31f, -0.07f, 1.92f);
        gy.B(i, 1.63f, 3.26f, 6.12f, 14.35f);
        i.moveTo(17.02f, 5.14f);
        i.lineToRelative(-1.3f, -2.17f);
        i.curveTo(15.35f, 2.37f, 14.7f, 2.0f, 14.0f, 2.0f);
        i.horizontalLineToRelative(-3.53f);
        i.lineToRelative(3.12f, 5.2f);
        i.lineToRelative(-1.72f, 1.03f);
        i.lineToRelative(5.49f, 1.37f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(i, 1.37f, -5.49f, 17.02f, 5.14f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _recycling = build;
        build.getClass();
        return build;
    }
}
