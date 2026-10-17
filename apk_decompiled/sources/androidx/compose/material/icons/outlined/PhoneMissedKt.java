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
import defpackage.er;
import defpackage.fc;
import defpackage.j50;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PhoneMissedKt {
    private static ImageVector _phoneMissed;

    public static final ImageVector getPhoneMissed(Icons.Outlined outlined) {
        ImageVector imageVector = _phoneMissed;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.PhoneMissed", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(23.71f, 16.67f);
        b.curveTo(20.66f, 13.78f, 16.54f, 12.0f, 12.0f, 12.0f);
        b.reflectiveCurveTo(3.34f, 13.78f, 0.29f, 16.67f);
        b.curveToRelative(-0.18f, 0.18f, -0.29f, 0.43f, -0.29f, 0.71f);
        b.curveToRelative(0.0f, 0.28f, 0.11f, 0.53f, 0.29f, 0.71f);
        b.lineToRelative(2.48f, 2.48f);
        b.curveToRelative(0.18f, 0.18f, 0.43f, 0.29f, 0.71f, 0.29f);
        b.curveToRelative(0.27f, 0.0f, 0.52f, -0.11f, 0.7f, -0.28f);
        b.curveToRelative(0.79f, -0.74f, 1.69f, -1.36f, 2.66f, -1.85f);
        b.curveToRelative(0.33f, -0.16f, 0.56f, -0.5f, 0.56f, -0.9f);
        b.verticalLineToRelative(-3.1f);
        b.curveToRelative(1.45f, -0.48f, 3.0f, -0.73f, 4.6f, -0.73f);
        b.reflectiveCurveToRelative(3.15f, 0.25f, 4.6f, 0.72f);
        b.verticalLineToRelative(3.1f);
        b.curveToRelative(0.0f, 0.39f, 0.23f, 0.74f, 0.56f, 0.9f);
        b.curveToRelative(0.98f, 0.49f, 1.87f, 1.12f, 2.67f, 1.85f);
        b.curveToRelative(0.18f, 0.18f, 0.43f, 0.28f, 0.7f, 0.28f);
        b.curveToRelative(0.28f, 0.0f, 0.53f, -0.11f, 0.71f, -0.29f);
        b.lineToRelative(2.48f, -2.48f);
        b.curveToRelative(0.18f, -0.18f, 0.29f, -0.43f, 0.29f, -0.71f);
        b.curveToRelative(0.0f, -0.28f, -0.12f, -0.52f, -0.3f, -0.7f);
        b.close();
        b.moveTo(5.4f, 17.23f);
        b.curveToRelative(-0.66f, 0.37f, -1.29f, 0.8f, -1.87f, 1.27f);
        b.lineToRelative(-1.07f, -1.07f);
        b.curveToRelative(0.91f, -0.75f, 1.9f, -1.39f, 2.95f, -1.9f);
        r6.l(b, 1.7f, 20.48f, 18.49f);
        b.curveToRelative(-0.6f, -0.48f, -1.22f, -0.9f, -1.88f, -1.27f);
        b.verticalLineToRelative(-1.7f);
        b.curveToRelative(1.05f, 0.51f, 2.03f, 1.15f, 2.95f, 1.9f);
        fc.B(b, -1.07f, 1.07f, 7.0f, 6.43f);
        b.lineToRelative(4.94f, 4.94f);
        b.lineToRelative(7.07f, -7.07f);
        b.lineToRelative(-1.41f, -1.42f);
        b.lineToRelative(-5.66f, 5.66f);
        b.lineTo(8.4f, 5.0f);
        b.lineTo(11.0f, 5.0f);
        b.lineTo(11.0f, 3.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, j50.w(b, 5.0f, 3.0f, 6.0f, 2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _phoneMissed = build;
        build.getClass();
        return build;
    }

    @er
    public static /* synthetic */ void getPhoneMissed$annotations(Icons.Outlined outlined) {
    }
}
