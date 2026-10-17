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
import defpackage.bv;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DiningKt {
    private static ImageVector _dining;

    public static final ImageVector getDining(Icons.Sharp sharp) {
        ImageVector imageVector = _dining;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Dining", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = r6.i(22.0f, 2.0f, 2.0f, 20.0f, 20.0f);
        bv.t(i, 2.0f, 11.0f, 10.3f);
        i.curveToRelative(0.0f, 0.93f, -0.64f, 1.71f, -1.5f, 1.93f);
        r6.v(i, 19.0f, 8.0f, -6.77f);
        i.curveToRelative(-0.86f, -0.22f, -1.5f, -1.0f, -1.5f, -1.93f);
        i.verticalLineTo(6.0f);
        i.horizontalLineTo(7.0f);
        i.horizontalLineToRelative(0.5f);
        i.verticalLineToRelative(3.0f);
        i.horizontalLineToRelative(0.75f);
        i.verticalLineTo(6.0f);
        i.horizontalLineToRelative(0.5f);
        i.horizontalLineToRelative(0.5f);
        kf0.w(i, 3.0f, 10.0f, 6.0f, 0.5f);
        bv.s(i, 11.0f, 10.3f, 15.58f, 12.59f);
        uo.x(i, -0.08f, 0.03f, 19.0f, 14.0f);
        i.verticalLineToRelative(-6.38f);
        i.lineToRelative(-0.08f, -0.04f);
        i.curveToRelative(-0.97f, -0.47f, -1.67f, -1.7f, -1.67f, -3.18f);
        i.curveToRelative(0.0f, -1.88f, 1.13f, -3.4f, 2.5f, -3.4f);
        i.curveToRelative(1.38f, 0.0f, 2.5f, 1.53f, 2.5f, 3.41f);
        i.curveTo(17.25f, 10.89f, 16.55f, 12.12f, 15.58f, 12.59f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _dining = build;
        build.getClass();
        return build;
    }
}
