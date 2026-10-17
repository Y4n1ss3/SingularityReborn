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
import defpackage.k4;
import defpackage.kp0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AutorenewKt {
    private static ImageVector _autorenew;

    public static final ImageVector getAutorenew(Icons.TwoTone twoTone) {
        ImageVector imageVector = _autorenew;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Autorenew", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder n = kp0.n(12.0f, 6.0f, 3.0f, 4.0f, -4.0f);
        n.lineToRelative(-4.0f, -4.0f);
        n.verticalLineToRelative(3.0f);
        n.curveToRelative(-4.42f, 0.0f, -8.0f, 3.58f, -8.0f, 8.0f);
        n.curveToRelative(0.0f, 1.57f, 0.46f, 3.03f, 1.24f, 4.26f);
        n.lineTo(6.7f, 14.8f);
        n.curveToRelative(-0.45f, -0.83f, -0.7f, -1.79f, -0.7f, -2.8f);
        n.curveToRelative(0.0f, -3.31f, 2.69f, -6.0f, 6.0f, -6.0f);
        k4.r(n, 18.76f, 7.74f, 17.3f, 9.2f);
        n.curveToRelative(0.44f, 0.84f, 0.7f, 1.79f, 0.7f, 2.8f);
        n.curveToRelative(0.0f, 3.31f, -2.69f, 6.0f, -6.0f, 6.0f);
        n.verticalLineToRelative(-3.0f);
        n.lineToRelative(-4.0f, 4.0f);
        n.lineToRelative(4.0f, 4.0f);
        n.verticalLineToRelative(-3.0f);
        n.curveToRelative(4.42f, 0.0f, 8.0f, -3.58f, 8.0f, -8.0f);
        n.curveToRelative(0.0f, -1.57f, -0.46f, -3.03f, -1.24f, -4.26f);
        n.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, n.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _autorenew = build;
        build.getClass();
        return build;
    }
}
