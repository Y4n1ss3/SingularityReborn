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
import defpackage.k4;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AttachmentKt {
    private static ImageVector _attachment;

    public static final ImageVector getAttachment(Icons.Outlined outlined) {
        ImageVector imageVector = _attachment;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Attachment", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(18.5f, 16.0f, 7.0f);
        d.curveToRelative(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f);
        d.reflectiveCurveToRelative(1.79f, -4.0f, 4.0f, -4.0f);
        d.horizontalLineToRelative(12.5f);
        d.curveToRelative(1.38f, 0.0f, 2.5f, 1.12f, 2.5f, 2.5f);
        d.reflectiveCurveTo(20.88f, 13.0f, 19.5f, 13.0f);
        d.horizontalLineTo(9.0f);
        d.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        d.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        uo.f(d, 9.5f, 9.5f, 9.0f);
        d.curveToRelative(-1.38f, 0.0f, -2.5f, 1.12f, -2.5f, 2.5f);
        d.reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f);
        d.horizontalLineToRelative(10.5f);
        d.curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
        d.reflectiveCurveToRelative(-1.79f, -4.0f, -4.0f, -4.0f);
        d.horizontalLineTo(7.0f);
        d.curveToRelative(-3.04f, 0.0f, -5.5f, 2.46f, -5.5f, 5.5f);
        d.reflectiveCurveToRelative(2.46f, 5.5f, 5.5f, 5.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.i(d, 11.5f, 16.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _attachment = build;
        build.getClass();
        return build;
    }
}
