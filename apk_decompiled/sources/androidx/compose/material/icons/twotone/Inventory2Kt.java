package androidx.compose.material.icons.twotone;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.c21;
import defpackage.fc;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class Inventory2Kt {
    private static ImageVector _inventory2;

    public static final ImageVector getInventory2(Icons.TwoTone twoTone) {
        ImageVector imageVector = _inventory2;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Inventory2", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(k4.e(4.0f, 7.0f, 16.0f, 0.0f), 0.0f, -3.02f, -16.0f, 0.02f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, companion3.m5145getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder v = uo.v(5.0f, 20.0f, 14.0f, 9.0f, 5.0f);
        k4.D(v, 20.0f, 9.0f, 12.0f, 6.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.q(v, 2.0f, 9.0f, 12.0f), defaultFillType2, "", solidColor2, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw3 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(20.0f, 2.0f, 4.0f);
        d.curveTo(3.0f, 2.0f, 2.0f, 2.9f, 2.0f, 4.0f);
        d.verticalLineToRelative(3.01f);
        d.curveTo(2.0f, 7.73f, 2.43f, 8.35f, 3.0f, 8.7f);
        d.verticalLineTo(20.0f);
        d.curveToRelative(0.0f, 1.1f, 1.1f, 2.0f, 2.0f, 2.0f);
        d.horizontalLineToRelative(14.0f);
        d.curveToRelative(0.9f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        d.verticalLineTo(8.7f);
        d.curveToRelative(0.57f, -0.35f, 1.0f, -0.97f, 1.0f, -1.69f);
        d.verticalLineTo(4.0f);
        d.curveTo(22.0f, 2.9f, 21.0f, 2.0f, 20.0f, 2.0f);
        c21.d(d, 19.0f, 20.0f, 5.0f, 9.0f);
        uo.r(d, 14.0f, 20.0f, 20.0f, 7.0f);
        d.horizontalLineTo(4.0f);
        d.verticalLineTo(4.0f);
        d.lineToRelative(16.0f, -0.02f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.f(d, 7.0f), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw3, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.c(9.0f, 12.0f, 6.0f, 2.0f, -6.0f), VectorKt.getDefaultFillType(), "", new SolidColor(companion.m4787getBlack0d7_KjU(), null), 1.0f, null, 1.0f, 1.0f, companion2.m5135getButtKaPHkGw(), companion3.m5145getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _inventory2 = build;
        build.getClass();
        return build;
    }
}
