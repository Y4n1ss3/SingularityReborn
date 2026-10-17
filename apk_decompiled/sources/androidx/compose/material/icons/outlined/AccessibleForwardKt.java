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
import defpackage.er;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AccessibleForwardKt {
    private static ImageVector _accessibleForward;

    public static final ImageVector getAccessibleForward(Icons.Outlined outlined) {
        ImageVector imageVector = _accessibleForward;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.AccessibleForward", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = af0.b(18.0f, 4.54f, -2.0f, 0.0f);
        b.arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f);
        b.arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder a = af0.a(15.0f, 17.0f, -2.0f);
        a.curveToRelative(0.0f, 1.65f, -1.35f, 3.0f, -3.0f, 3.0f);
        a.reflectiveCurveToRelative(-3.0f, -1.35f, -3.0f, -3.0f);
        a.reflectiveCurveToRelative(1.35f, -3.0f, 3.0f, -3.0f);
        a.verticalLineToRelative(-2.0f);
        a.curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f);
        a.reflectiveCurveToRelative(2.24f, 5.0f, 5.0f, 5.0f);
        a.reflectiveCurveToRelative(5.0f, -2.24f, 5.0f, -5.0f);
        af0.l(a, 18.0f, 13.5f, -1.86f);
        a.lineToRelative(1.67f, -3.67f);
        a.curveTo(18.42f, 8.5f, 17.44f, 7.0f, 15.96f, 7.0f);
        a.horizontalLineToRelative(-5.2f);
        a.curveToRelative(-0.81f, 0.0f, -1.54f, 0.47f, -1.87f, 1.2f);
        a.lineTo(8.22f, 10.0f);
        a.lineToRelative(1.92f, 0.53f);
        a.lineToRelative(0.65f, -1.53f);
        a.lineTo(13.0f, 9.0f);
        a.lineToRelative(-1.83f, 4.1f);
        a.curveToRelative(-0.6f, 1.33f, 0.39f, 2.9f, 1.85f, 2.9f);
        af0.m(a, 18.0f, 16.0f, 5.0f, 2.0f);
        a.verticalLineToRelative(-5.5f);
        a.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        a.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, a.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _accessibleForward = build;
        build.getClass();
        return build;
    }

    @er
    public static /* synthetic */ void getAccessibleForward$annotations(Icons.Outlined outlined) {
    }
}
