package androidx.compose.material.icons.automirrored.filled;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.gy;
import defpackage.kf0;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ScheduleSendKt {
    private static ImageVector _scheduleSend;

    public static final ImageVector getScheduleSend(Icons.AutoMirrored.Filled filled) {
        ImageVector imageVector = _scheduleSend;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.Filled.ScheduleSend", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder s = uo.s(16.5f, 12.5f, 15.0f, 12.5f, 4.0f);
        s.lineToRelative(3.0f, 2.0f);
        s.lineToRelative(0.75f, -1.23f);
        gy.B(s, -2.25f, -1.52f, 16.5f, 12.5f);
        s.moveTo(16.0f, 9.0f);
        s.lineTo(2.0f, 3.0f);
        s.verticalLineToRelative(7.0f);
        s.lineToRelative(9.0f, 2.0f);
        s.lineToRelative(-9.0f, 2.0f);
        s.verticalLineToRelative(7.0f);
        s.lineToRelative(7.27f, -3.11f);
        s.curveTo(10.09f, 20.83f, 12.79f, 23.0f, 16.0f, 23.0f);
        s.curveToRelative(3.86f, 0.0f, 7.0f, -3.14f, 7.0f, -7.0f);
        s.reflectiveCurveToRelative(-3.14f, -7.0f, -7.0f, -7.0f);
        s.close();
        s.moveTo(16.0f, 21.0f);
        s.curveToRelative(-2.75f, 0.0f, -4.98f, -2.22f, -5.0f, -4.97f);
        s.verticalLineToRelative(-0.07f);
        s.curveToRelative(0.02f, -2.74f, 2.25f, -4.97f, 5.0f, -4.97f);
        s.curveToRelative(2.76f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(s, 18.76f, 21.0f, 16.0f, 21.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _scheduleSend = build;
        build.getClass();
        return build;
    }
}
