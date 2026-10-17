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
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ReportKt {
    private static ImageVector _report;

    public static final ImageVector getReport(Icons.Sharp sharp) {
        ImageVector imageVector = _report;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Report", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(15.73f, 3.0f, 8.27f, 3.0f);
        i.lineTo(3.0f, 8.27f);
        uo.k(i, 7.46f, 8.27f, 21.0f, 7.46f);
        i.lineTo(21.0f, 15.73f);
        r6.C(i, 21.0f, 8.27f, 15.73f, 3.0f);
        i.moveTo(12.0f, 17.3f);
        i.curveToRelative(-0.72f, 0.0f, -1.3f, -0.58f, -1.3f, -1.3f);
        i.reflectiveCurveToRelative(0.58f, -1.3f, 1.3f, -1.3f);
        i.reflectiveCurveToRelative(1.3f, 0.58f, 1.3f, 1.3f);
        i.reflectiveCurveToRelative(-0.58f, 1.3f, -1.3f, 1.3f);
        af0.l(i, 13.0f, 13.0f, -2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.x(i, 11.0f, 7.0f, 2.0f, 6.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _report = build;
        build.getClass();
        return build;
    }
}
