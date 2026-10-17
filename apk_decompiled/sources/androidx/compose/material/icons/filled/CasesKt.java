package androidx.compose.material.icons.filled;

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
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CasesKt {
    private static ImageVector _cases;

    public static final ImageVector getCases(Icons.Filled filled) {
        ImageVector imageVector = _cases;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Cases", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(18.0f, 6.0f, 18.0f, 4.0f);
        i.lineToRelative(-2.0f, -2.0f);
        i.horizontalLineToRelative(-5.0f);
        i.lineTo(9.0f, 4.0f);
        i.verticalLineToRelative(2.0f);
        i.lineTo(5.0f, 6.0f);
        i.verticalLineToRelative(11.0f);
        i.reflectiveCurveToRelative(1.0f, 2.0f, 2.0f, 2.0f);
        i.horizontalLineToRelative(13.0f);
        i.reflectiveCurveToRelative(2.0f, -0.98f, 2.0f, -2.0f);
        uf.j(i, 22.0f, 6.0f, -4.0f);
        i.moveTo(4.0f, 9.0f);
        i.lineTo(2.0f, 9.0f);
        i.verticalLineToRelative(11.0f);
        i.curveToRelative(0.0f, 1.11f, 0.89f, 2.0f, 2.0f, 2.0f);
        i.horizontalLineToRelative(14.0f);
        i.curveToRelative(1.11f, 0.0f, 2.0f, -0.89f, 2.0f, -2.0f);
        r6.C(i, 4.0f, 20.0f, 4.0f, 9.0f);
        i.moveTo(11.0f, 5.0f);
        i.curveToRelative(0.0f, -0.55f, 0.53f, -1.0f, 1.0f, -1.0f);
        i.horizontalLineToRelative(3.0f);
        i.curveToRelative(0.46f, 0.0f, 1.0f, 0.54f, 1.0f, 1.0f);
        uo.D(i, 1.0f, -5.0f, 11.0f, 5.0f);
        k4.C(i, 5.0f, 6.0f, 17.0f, 11.0f);
        i.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        i.lineTo(7.0f, 19.0f);
        i.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(i, 5.0f, 6.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _cases = build;
        build.getClass();
        return build;
    }
}
