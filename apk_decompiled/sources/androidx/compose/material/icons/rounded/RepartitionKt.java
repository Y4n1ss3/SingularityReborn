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
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RepartitionKt {
    private static ImageVector _repartition;

    public static final ImageVector getRepartition(Icons.Rounded rounded) {
        ImageVector imageVector = _repartition;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Repartition", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder a = af0.a(4.5f, 21.0f, 15.0f);
        a.curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        a.verticalLineToRelative(-3.0f);
        a.curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        a.horizontalLineToRelative(-15.0f);
        a.curveTo(3.67f, 15.0f, 3.0f, 15.67f, 3.0f, 16.5f);
        a.verticalLineToRelative(3.0f);
        a.curveTo(3.0f, 20.33f, 3.67f, 21.0f, 4.5f, 21.0f);
        uo.C(a, 10.33f, 19.0f, -2.0f, 3.33f);
        kf0.n(a, 2.0f, 10.33f, 19.0f, 19.0f);
        gy.t(a, -3.33f, -2.0f, 19.0f, 19.0f);
        k4.C(a, 5.0f, 17.0f, 3.33f, 2.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.o(a, 5.0f, 17.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(6.71f, 9.29f, 6.71f, 9.29f);
        i.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.42f);
        i.lineTo(5.83f, 7.0f);
        i.lineToRelative(11.06f, 0.0f);
        i.curveToRelative(1.0f, 0.0f, 1.92f, 0.68f, 2.08f, 1.66f);
        i.curveTo(19.18f, 9.91f, 18.21f, 11.0f, 17.0f, 11.0f);
        i.horizontalLineTo(4.0f);
        i.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        i.verticalLineToRelative(0.0f);
        i.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        i.lineToRelative(12.82f, 0.0f);
        i.curveToRelative(2.09f, 0.0f, 3.96f, -1.52f, 4.16f, -3.6f);
        i.curveTo(21.21f, 7.02f, 19.34f, 5.0f, 17.0f, 5.0f);
        i.horizontalLineTo(5.83f);
        i.lineToRelative(0.88f, -0.88f);
        i.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.42f);
        i.lineToRelative(0.0f, 0.0f);
        i.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        i.lineTo(2.71f, 5.29f);
        i.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        i.lineToRelative(2.59f, 2.59f);
        i.curveTo(5.68f, 9.68f, 6.32f, 9.68f, 6.71f, 9.29f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _repartition = build;
        build.getClass();
        return build;
    }
}
