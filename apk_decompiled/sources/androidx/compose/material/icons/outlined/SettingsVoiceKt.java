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
import defpackage.bv;
import defpackage.fc;
import defpackage.j50;
import defpackage.k4;
import defpackage.kp0;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SettingsVoiceKt {
    private static ImageVector _settingsVoice;

    public static final ImageVector getSettingsVoice(Icons.Outlined outlined) {
        ImageVector imageVector = _settingsVoice;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.SettingsVoice", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = bv.b(7.0f, 22.0f, 2.0f, 2.0f);
        uo.l(b, 7.0f, 24.0f, 12.0f, 13.0f);
        b.curveToRelative(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f);
        b.lineTo(15.0f, 4.0f);
        b.curveToRelative(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
        b.reflectiveCurveTo(9.0f, 2.34f, 9.0f, 4.0f);
        b.verticalLineToRelative(6.0f);
        b.curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        b.close();
        b.moveTo(11.0f, 4.0f);
        b.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        b.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        b.verticalLineToRelative(6.0f);
        b.curveToRelative(0.0f, 0.56f, -0.44f, 1.0f, -1.0f, 1.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        uo.l(b, 11.0f, 4.0f, 11.0f, 22.0f);
        j50.n(b, 2.0f, 2.0f, -2.0f);
        k4.C(b, 15.0f, 22.0f, 2.0f, 2.0f);
        kp0.A(b, -2.0f, 19.0f, 10.0f, -1.7f);
        b.curveToRelative(0.0f, 3.0f, -2.54f, 5.1f, -5.3f, 5.1f);
        b.reflectiveCurveTo(6.7f, 13.0f, 6.7f, 10.0f);
        b.lineTo(5.0f, 10.0f);
        b.curveToRelative(0.0f, 3.41f, 2.72f, 6.23f, 6.0f, 6.72f);
        fc.w(b, 11.0f, 20.0f, 2.0f, -3.28f);
        b.curveToRelative(3.28f, -0.49f, 6.0f, -3.31f, 6.0f, -6.72f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _settingsVoice = build;
        build.getClass();
        return build;
    }
}
