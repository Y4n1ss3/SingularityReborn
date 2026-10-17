package androidx.compose.material.icons.rounded;

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
import defpackage.k4;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class HomeWorkKt {
    private static ImageVector _homeWork;

    public static final ImageVector getHomeWork(Icons.Rounded rounded) {
        ImageVector imageVector = _homeWork;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.HomeWork", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(14.16f, 10.4f, -5.0f, -3.57f);
        e.curveToRelative(-0.7f, -0.5f, -1.63f, -0.5f, -2.32f, 0.0f);
        e.lineToRelative(-5.0f, 3.57f);
        e.curveTo(1.31f, 10.78f, 1.0f, 11.38f, 1.0f, 12.03f);
        e.verticalLineTo(20.0f);
        e.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        af0.v(e, 4.0f, -6.0f, 4.0f, 6.0f);
        e.horizontalLineToRelative(4.0f);
        e.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        e.verticalLineToRelative(-7.97f);
        e.curveTo(15.0f, 11.38f, 14.69f, 10.78f, 14.16f, 10.4f);
        e.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder a = af0.a(21.03f, 3.0f, -9.06f);
        a.curveTo(10.88f, 3.0f, 10.0f, 3.88f, 10.0f, 4.97f);
        a.lineToRelative(0.09f, 0.09f);
        a.curveToRelative(0.08f, 0.05f, 0.16f, 0.09f, 0.24f, 0.14f);
        a.lineToRelative(5.0f, 3.57f);
        a.curveToRelative(0.76f, 0.54f, 1.3f, 1.34f, 1.54f, 2.23f);
        uf.k(a, 19.0f, 2.0f, -2.0f, 2.0f);
        af0.v(a, 2.0f, 2.0f, -2.0f, 3.0f);
        a.verticalLineToRelative(1.0f);
        a.horizontalLineToRelative(4.03f);
        a.curveToRelative(1.09f, 0.0f, 1.97f, -0.88f, 1.97f, -1.97f);
        a.verticalLineTo(4.97f);
        a.curveTo(23.0f, 3.88f, 22.12f, 3.0f, 21.03f, 3.0f);
        af0.r(a, 19.0f, 9.0f, -2.0f, 7.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.i(a, 2.0f, 9.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _homeWork = build;
        build.getClass();
        return build;
    }
}
