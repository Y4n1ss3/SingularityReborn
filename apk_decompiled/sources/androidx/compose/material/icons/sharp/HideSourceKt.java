package androidx.compose.material.icons.sharp;

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

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class HideSourceKt {
    private static ImageVector _hideSource;

    public static final ImageVector getHideSource(Icons.Sharp sharp) {
        ImageVector imageVector = _hideSource;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.HideSource", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(2.81f, 2.81f, 1.39f, 4.22f);
        i.lineToRelative(2.27f, 2.27f);
        i.curveTo(2.61f, 8.07f, 2.0f, 9.96f, 2.0f, 12.0f);
        i.curveToRelative(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f);
        i.curveToRelative(2.04f, 0.0f, 3.93f, -0.61f, 5.51f, -1.66f);
        i.lineToRelative(2.27f, 2.27f);
        gy.B(i, 1.41f, -1.41f, 2.81f, 2.81f);
        i.moveTo(12.0f, 20.0f);
        i.curveToRelative(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f);
        i.curveToRelative(0.0f, -1.48f, 0.41f, -2.86f, 1.12f, -4.06f);
        i.lineToRelative(10.94f, 10.94f);
        i.curveTo(14.86f, 19.59f, 13.48f, 20.0f, 12.0f, 20.0f);
        k4.r(i, 7.94f, 5.12f, 6.49f, 3.66f);
        i.curveTo(8.07f, 2.61f, 9.96f, 2.0f, 12.0f, 2.0f);
        i.curveToRelative(5.52f, 0.0f, 10.0f, 4.48f, 10.0f, 10.0f);
        i.curveToRelative(0.0f, 2.04f, -0.61f, 3.93f, -1.66f, 5.51f);
        i.lineToRelative(-1.46f, -1.46f);
        i.curveTo(19.59f, 14.86f, 20.0f, 13.48f, 20.0f, 12.0f);
        i.curveToRelative(0.0f, -4.41f, -3.59f, -8.0f, -8.0f, -8.0f);
        i.curveTo(10.52f, 4.0f, 9.14f, 4.41f, 7.94f, 5.12f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _hideSource = build;
        build.getClass();
        return build;
    }
}
