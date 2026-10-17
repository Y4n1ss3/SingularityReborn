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
import defpackage.kf0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class VoicemailKt {
    private static ImageVector _voicemail;

    public static final ImageVector getVoicemail(Icons.Sharp sharp) {
        ImageVector imageVector = _voicemail;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Voicemail", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(18.5f, 6.0f);
        b.curveTo(15.46f, 6.0f, 13.0f, 8.46f, 13.0f, 11.5f);
        b.curveToRelative(0.0f, 1.33f, 0.47f, 2.55f, 1.26f, 3.5f);
        b.lineTo(9.74f, 15.0f);
        b.curveToRelative(0.79f, -0.95f, 1.26f, -2.17f, 1.26f, -3.5f);
        b.curveTo(11.0f, 8.46f, 8.54f, 6.0f, 5.5f, 6.0f);
        b.reflectiveCurveTo(0.0f, 8.46f, 0.0f, 11.5f);
        b.reflectiveCurveTo(2.46f, 17.0f, 5.5f, 17.0f);
        b.horizontalLineToRelative(13.0f);
        b.curveToRelative(3.04f, 0.0f, 5.5f, -2.46f, 5.5f, -5.5f);
        b.reflectiveCurveTo(21.54f, 6.0f, 18.5f, 6.0f);
        b.close();
        b.moveTo(5.5f, 15.0f);
        b.curveTo(3.57f, 15.0f, 2.0f, 13.43f, 2.0f, 11.5f);
        b.reflectiveCurveTo(3.57f, 8.0f, 5.5f, 8.0f);
        b.reflectiveCurveTo(9.0f, 9.57f, 9.0f, 11.5f);
        b.reflectiveCurveTo(7.43f, 15.0f, 5.5f, 15.0f);
        b.close();
        b.moveTo(18.5f, 15.0f);
        b.curveToRelative(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f);
        b.reflectiveCurveTo(16.57f, 8.0f, 18.5f, 8.0f);
        b.reflectiveCurveTo(22.0f, 9.57f, 22.0f, 11.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(b, 20.43f, 15.0f, 18.5f, 15.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _voicemail = build;
        build.getClass();
        return build;
    }
}
