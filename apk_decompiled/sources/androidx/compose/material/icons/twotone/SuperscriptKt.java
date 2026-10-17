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
import defpackage.af0;
import defpackage.bv;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SuperscriptKt {
    private static ImageVector _superscript;

    public static final ImageVector getSuperscript(Icons.TwoTone twoTone) {
        ImageVector imageVector = _superscript;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Superscript", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder n = k4.n(22.0f, 7.0f, -2.0f, 1.0f, 3.0f);
        bv.x(n, 1.0f, -4.0f, 7.0f);
        n.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        af0.n(n, 2.0f, 5.0f, -3.0f, 4.0f);
        n.horizontalLineToRelative(3.0f);
        n.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        n.verticalLineToRelative(1.0f);
        n.curveTo(23.0f, 6.55f, 22.55f, 7.0f, 22.0f, 7.0f);
        af0.l(n, 5.88f, 20.0f, 2.66f);
        n.lineToRelative(3.4f, -5.42f);
        kf0.B(n, 0.12f, 3.4f, 5.42f, 2.66f);
        n.lineToRelative(-4.65f, -7.27f);
        n.lineTo(17.81f, 6.0f);
        kf0.B(n, -2.68f, -3.07f, 4.99f, -0.12f);
        n.lineTo(8.85f, 6.0f);
        n.horizontalLineTo(6.19f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(n, 4.32f, 6.73f, 5.88f, 20.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _superscript = build;
        build.getClass();
        return build;
    }
}
