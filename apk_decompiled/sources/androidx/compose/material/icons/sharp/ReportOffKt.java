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
import defpackage.gy;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ReportOffKt {
    private static ImageVector _reportOff;

    public static final ImageVector getReportOff(Icons.Sharp sharp) {
        ImageVector imageVector = _reportOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.ReportOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = bv.b(11.0f, 7.0f, 2.0f, 2.33f);
        b.lineToRelative(7.2f, 7.2f);
        b.lineToRelative(0.8f, -0.8f);
        b.lineTo(21.0f, 8.27f);
        b.lineTo(15.73f, 3.0f);
        b.lineTo(8.27f, 3.0f);
        gy.B(b, -0.8f, 0.8f, 11.0f, 7.33f);
        b.moveTo(2.41f, 1.58f);
        b.lineTo(1.0f, 2.99f);
        b.lineToRelative(3.64f, 3.64f);
        b.lineTo(3.0f, 8.27f);
        uo.k(b, 7.46f, 8.27f, 21.0f, 7.46f);
        b.lineToRelative(1.64f, -1.64f);
        b.lineTo(21.01f, 23.0f);
        gy.B(b, 1.41f, -1.41f, 2.41f, 1.58f);
        b.moveTo(11.0f, 12.99f);
        b.lineToRelative(0.01f, 0.01f);
        bv.r(b, 11.0f, 13.0f, -0.01f);
        b.moveTo(12.0f, 17.3f);
        b.curveToRelative(-0.72f, 0.0f, -1.3f, -0.58f, -1.3f, -1.3f);
        b.curveToRelative(0.0f, -0.72f, 0.58f, -1.3f, 1.3f, -1.3f);
        b.reflectiveCurveToRelative(1.3f, 0.58f, 1.3f, 1.3f);
        b.curveToRelative(0.0f, 0.72f, -0.58f, 1.3f, -1.3f, 1.3f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _reportOff = build;
        build.getClass();
        return build;
    }
}
