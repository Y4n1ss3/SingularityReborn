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
import defpackage.gy;
import defpackage.kp0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NoFoodKt {
    private static ImageVector _noFood;

    public static final ImageVector getNoFood(Icons.Outlined outlined) {
        ImageVector imageVector = _noFood;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.NoFood", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = bv.b(1.0f, 21.0f, 15.01f, 0.98f);
        b.curveToRelative(0.0f, 0.56f, -0.45f, 1.01f, -1.01f, 1.01f);
        b.horizontalLineTo(2.01f);
        b.curveTo(1.45f, 22.99f, 1.0f, 22.54f, 1.0f, 21.98f);
        bv.t(b, 21.0f, 20.49f, 23.31f);
        uf.u(b, 16.0f, 18.83f, 19.0f, 1.0f);
        gy.C(b, -2.0f, 13.17f, -2.0f, -2.0f);
        b.horizontalLineTo(1.0f);
        b.curveToRelative(0.0f, -3.24f, 2.46f, -5.17f, 5.38f, -5.79f);
        b.lineToRelative(-5.7f, -5.7f);
        b.lineTo(2.1f, 2.1f);
        b.lineTo(13.0f, 13.0f);
        b.lineToRelative(2.0f, 2.0f);
        gy.B(b, 6.9f, 6.9f, 20.49f, 23.31f);
        b.moveTo(10.17f, 13.0f);
        b.lineToRelative(-2.0f, -2.0f);
        b.curveToRelative(-1.42f, 0.06f, -3.52f, 0.56f, -4.55f, 2.0f);
        kp0.r(b, 10.17f, 23.0f, 5.0f, -5.0f);
        uf.p(b, 1.0f, -2.0f, 4.0f, -5.0f);
        b.lineToRelative(0.23f, 2.0f);
        b.horizontalLineToRelative(9.56f);
        b.lineToRelative(-1.0f, 9.97f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(b, 1.83f, 1.83f, 23.0f, 5.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _noFood = build;
        build.getClass();
        return build;
    }
}
