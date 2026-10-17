package androidx.compose.material.icons.outlined;

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
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class HdrOffKt {
    private static ImageVector _hdrOff;

    public static final ImageVector getHdrOff(Icons.Outlined outlined) {
        ImageVector imageVector = _hdrOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.HdrOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder m = fc.m(17.5f, 15.0f, -2.0f, 1.1f);
        m.lineToRelative(0.9f, 2.0f);
        m.lineTo(21.0f, 15.0f);
        m.lineToRelative(-0.9f, -2.1f);
        m.curveToRelative(0.5f, -0.3f, 0.9f, -0.8f, 0.9f, -1.4f);
        m.verticalLineToRelative(-1.0f);
        m.curveToRelative(0.0f, -0.8f, -0.7f, -1.5f, -1.5f, -1.5f);
        m.lineTo(16.0f, 9.0f);
        m.verticalLineToRelative(4.86f);
        m.lineTo(17.14f, 15.0f);
        m.horizontalLineToRelative(0.36f);
        m.close();
        k4.C(m, 17.5f, 10.5f, 2.0f, 1.0f);
        fc.x(m, -2.0f, -1.0f, 13.0f, 10.5f);
        m.verticalLineToRelative(0.36f);
        m.lineToRelative(1.5f, 1.5f);
        m.lineTo(14.5f, 10.5f);
        m.curveToRelative(0.0f, -0.8f, -0.7f, -1.5f, -1.5f, -1.5f);
        m.horizontalLineToRelative(-1.86f);
        gy.B(m, 1.5f, 1.5f, 13.0f, 10.5f);
        m.moveTo(2.51f, 2.49f);
        m.lineTo(1.45f, 3.55f);
        fc.w(m, 6.9f, 9.0f, -0.4f, 2.0f);
        m.horizontalLineToRelative(-2.0f);
        m.lineTo(4.5f, 9.0f);
        af0.m(m, 3.0f, 9.0f, 6.0f, 1.5f);
        uo.B(m, -2.5f, 2.0f, 6.5f, 15.0f);
        m.lineTo(8.0f, 15.0f);
        m.verticalLineToRelative(-4.9f);
        m.lineToRelative(1.5f, 1.5f);
        m.lineTo(9.5f, 15.0f);
        m.horizontalLineToRelative(3.4f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(m, 7.6f, 7.6f, 1.06f, -1.06f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _hdrOff = build;
        build.getClass();
        return build;
    }
}
