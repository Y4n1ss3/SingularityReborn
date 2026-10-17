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
import defpackage.fc;
import defpackage.kp0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class StyleKt {
    private static ImageVector _style;

    public static final ImageVector getStyle(Icons.Sharp sharp) {
        ImageVector imageVector = _style;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Style", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder n = kp0.n(3.87f, 20.21f, -9.03f, -3.19f, 7.7f);
        fc.B(n, 3.19f, 1.33f, 22.79f, 17.78f);
        n.lineTo(16.31f, 2.14f);
        n.lineTo(5.26f, 6.71f);
        fc.C(n, 6.48f, 15.64f, 11.05f, -4.57f);
        n.moveTo(7.88f, 8.75f);
        n.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        n.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        n.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        n.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        af0.l(n, 5.88f, 21.75f, 3.45f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.n(n, -3.45f, -8.34f, 8.34f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _style = build;
        build.getClass();
        return build;
    }
}
