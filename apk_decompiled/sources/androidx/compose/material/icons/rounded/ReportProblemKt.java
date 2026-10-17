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
import defpackage.fc;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ReportProblemKt {
    private static ImageVector _reportProblem;

    public static final ImageVector getReportProblem(Icons.Rounded rounded) {
        ImageVector imageVector = _reportProblem;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.ReportProblem", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder a = af0.a(2.73f, 21.0f, 18.53f);
        a.curveToRelative(0.77f, 0.0f, 1.25f, -0.83f, 0.87f, -1.5f);
        a.lineToRelative(-9.27f, -16.0f);
        a.curveToRelative(-0.39f, -0.67f, -1.35f, -0.67f, -1.73f, 0.0f);
        a.lineToRelative(-9.27f, 16.0f);
        a.curveToRelative(-0.38f, 0.67f, 0.1f, 1.5f, 0.87f, 1.5f);
        r6.B(a, 13.0f, 18.0f, -2.0f, -2.0f);
        fc.x(a, 2.0f, 2.0f, 12.0f, 14.0f);
        a.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        a.verticalLineToRelative(-2.0f);
        a.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        a.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        a.verticalLineToRelative(2.0f);
        a.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        a.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, a.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _reportProblem = build;
        build.getClass();
        return build;
    }
}
