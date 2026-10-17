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
import defpackage.k4;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ExpandCircleDownKt {
    private static ImageVector _expandCircleDown;

    public static final ImageVector getExpandCircleDown(Icons.Sharp sharp) {
        ImageVector imageVector = _expandCircleDown;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.ExpandCircleDown", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 2.0f);
        b.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        b.curveToRelative(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f);
        b.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        b.curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f);
        k4.r(b, 12.0f, 15.5f, 7.5f, 11.0f);
        b.lineToRelative(1.42f, -1.41f);
        b.lineTo(12.0f, 12.67f);
        b.lineToRelative(3.08f, -3.08f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(b, 16.5f, 11.0f, 12.0f, 15.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _expandCircleDown = build;
        build.getClass();
        return build;
    }
}
