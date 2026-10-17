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
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class GavelKt {
    private static ImageVector _gavel;

    public static final ImageVector getGavel(Icons.Rounded rounded) {
        ImageVector imageVector = _gavel;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Gavel", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder a = af0.a(2.0f, 21.0f, 10.0f);
        a.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        a.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        a.lineTo(2.0f, 23.0f);
        a.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        a.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        k4.x(a, 5.24f, 8.07f, 2.83f, -2.83f);
        a.lineTo(20.8f, 17.97f);
        a.curveToRelative(0.78f, 0.78f, 0.78f, 2.05f, 0.0f, 2.83f);
        a.curveToRelative(-0.78f, 0.78f, -2.05f, 0.78f, -2.83f, 0.0f);
        uo.l(a, 5.24f, 8.07f, 13.73f, 2.41f);
        a.lineToRelative(2.83f, 2.83f);
        a.curveToRelative(0.78f, 0.78f, 0.78f, 2.05f, 0.0f, 2.83f);
        a.lineToRelative(-1.42f, 1.42f);
        a.lineToRelative(-5.65f, -5.66f);
        a.lineToRelative(1.41f, -1.41f);
        a.curveToRelative(0.78f, -0.79f, 2.05f, -0.79f, 2.83f, -0.01f);
        k4.x(a, 3.83f, 9.48f, 5.66f, 5.66f);
        a.lineToRelative(-1.41f, 1.41f);
        a.curveToRelative(-0.78f, 0.78f, -2.05f, 0.78f, -2.83f, 0.0f);
        a.lineToRelative(-2.83f, -2.83f);
        a.curveToRelative(-0.78f, -0.78f, -0.78f, -2.05f, 0.0f, -2.83f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uf.g(a, 1.41f, -1.41f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _gavel = build;
        build.getClass();
        return build;
    }
}
