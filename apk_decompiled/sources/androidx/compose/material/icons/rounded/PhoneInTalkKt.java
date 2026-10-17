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
import defpackage.k4;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PhoneInTalkKt {
    private static ImageVector _phoneInTalk;

    public static final ImageVector getPhoneInTalk(Icons.Rounded rounded) {
        ImageVector imageVector = _phoneInTalk;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.PhoneInTalk", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.88f, 5.05f);
        b.curveToRelative(3.18f, 0.4f, 5.67f, 2.89f, 6.07f, 6.07f);
        b.curveToRelative(0.06f, 0.51f, 0.49f, 0.88f, 0.99f, 0.88f);
        b.curveToRelative(0.04f, 0.0f, 0.08f, 0.0f, 0.12f, -0.01f);
        b.curveToRelative(0.55f, -0.07f, 0.94f, -0.57f, 0.87f, -1.12f);
        b.curveToRelative(-0.51f, -4.09f, -3.72f, -7.3f, -7.81f, -7.81f);
        b.curveToRelative(-0.55f, -0.06f, -1.05f, 0.33f, -1.11f, 0.88f);
        b.curveToRelative(-0.07f, 0.55f, 0.32f, 1.05f, 0.87f, 1.11f);
        b.close();
        b.moveTo(13.26f, 7.16f);
        b.curveToRelative(-0.53f, -0.14f, -1.08f, 0.18f, -1.22f, 0.72f);
        b.reflectiveCurveToRelative(0.18f, 1.08f, 0.72f, 1.22f);
        b.curveToRelative(1.05f, 0.27f, 1.87f, 1.09f, 2.15f, 2.15f);
        b.curveToRelative(0.12f, 0.45f, 0.52f, 0.75f, 0.97f, 0.75f);
        b.curveToRelative(0.08f, 0.0f, 0.17f, -0.01f, 0.25f, -0.03f);
        b.curveToRelative(0.53f, -0.14f, 0.85f, -0.69f, 0.72f, -1.22f);
        b.curveToRelative(-0.47f, -1.77f, -1.84f, -3.14f, -3.59f, -3.59f);
        k4.x(b, 19.23f, 15.26f, -2.54f, -0.29f);
        b.curveToRelative(-0.61f, -0.07f, -1.21f, 0.14f, -1.64f, 0.57f);
        b.lineToRelative(-1.84f, 1.84f);
        b.curveToRelative(-2.83f, -1.44f, -5.15f, -3.75f, -6.59f, -6.59f);
        b.lineToRelative(1.85f, -1.85f);
        b.curveToRelative(0.43f, -0.43f, 0.64f, -1.03f, 0.57f, -1.64f);
        b.lineToRelative(-0.29f, -2.52f);
        b.curveToRelative(-0.12f, -1.01f, -0.97f, -1.77f, -1.99f, -1.77f);
        b.lineTo(5.03f, 3.01f);
        b.curveToRelative(-1.13f, 0.0f, -2.07f, 0.94f, -2.0f, 2.07f);
        b.curveToRelative(0.53f, 8.54f, 7.36f, 15.36f, 15.89f, 15.89f);
        b.curveToRelative(1.13f, 0.07f, 2.07f, -0.87f, 2.07f, -2.0f);
        b.verticalLineToRelative(-1.73f);
        b.curveToRelative(0.01f, -1.01f, -0.75f, -1.86f, -1.76f, -1.98f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _phoneInTalk = build;
        build.getClass();
        return build;
    }
}
