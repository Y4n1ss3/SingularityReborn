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
import defpackage.fc;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class HourglassEmptyKt {
    private static ImageVector _hourglassEmpty;

    public static final ImageVector getHourglassEmpty(Icons.Sharp sharp) {
        ImageVector imageVector = _hourglassEmpty;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.HourglassEmpty", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder m = fc.m(6.0f, 2.0f, 6.0f, 0.01f);
        m.lineTo(6.0f, 8.01f);
        m.lineTo(10.0f, 12.0f);
        m.lineToRelative(-4.0f, 4.0f);
        m.lineToRelative(0.01f, 0.01f);
        m.lineTo(6.0f, 16.01f);
        fc.w(m, 6.0f, 22.0f, 12.0f, -5.99f);
        m.horizontalLineToRelative(-0.01f);
        m.lineTo(18.0f, 16.0f);
        m.lineToRelative(-4.0f, -4.0f);
        m.lineToRelative(4.0f, -3.99f);
        m.lineToRelative(-0.01f, -0.01f);
        m.lineTo(18.0f, 8.0f);
        r6.C(m, 18.0f, 2.0f, 6.0f, 2.0f);
        m.moveTo(16.0f, 16.5f);
        m.lineTo(16.0f, 20.0f);
        m.lineTo(8.0f, 20.0f);
        m.verticalLineToRelative(-3.5f);
        fc.C(m, 4.0f, -4.0f, 4.0f, 4.0f);
        m.moveTo(12.0f, 11.5f);
        m.lineToRelative(-4.0f, -4.0f);
        fc.w(m, 8.0f, 4.0f, 8.0f, 3.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uf.g(m, -4.0f, 4.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _hourglassEmpty = build;
        build.getClass();
        return build;
    }
}
