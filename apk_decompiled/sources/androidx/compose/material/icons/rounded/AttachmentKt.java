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
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AttachmentKt {
    private static ImageVector _attachment;

    public static final ImageVector getAttachment(Icons.Rounded rounded) {
        ImageVector imageVector = _attachment;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Attachment", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(17.75f, 16.0f, 7.17f);
        d.curveToRelative(-2.09f, 0.0f, -3.95f, -1.53f, -4.15f, -3.61f);
        d.curveTo(2.79f, 10.01f, 4.66f, 8.0f, 7.0f, 8.0f);
        d.horizontalLineToRelative(12.36f);
        d.curveToRelative(1.31f, 0.0f, 2.5f, 0.94f, 2.63f, 2.24f);
        d.curveToRelative(0.15f, 1.5f, -1.02f, 2.76f, -2.49f, 2.76f);
        d.horizontalLineTo(9.0f);
        d.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        d.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        d.horizontalLineToRelative(8.75f);
        d.curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f);
        d.reflectiveCurveToRelative(-0.34f, -0.75f, -0.75f, -0.75f);
        d.horizontalLineTo(9.14f);
        d.curveToRelative(-1.31f, 0.0f, -2.5f, 0.94f, -2.63f, 2.24f);
        d.curveToRelative(-0.15f, 1.5f, 1.02f, 2.76f, 2.49f, 2.76f);
        d.horizontalLineToRelative(10.33f);
        d.curveToRelative(2.09f, 0.0f, 3.95f, -1.53f, 4.15f, -3.61f);
        d.curveToRelative(0.23f, -2.39f, -1.64f, -4.39f, -3.98f, -4.39f);
        d.horizontalLineTo(7.23f);
        d.curveToRelative(-2.87f, 0.0f, -5.44f, 2.1f, -5.71f, 4.96f);
        d.curveToRelative(-0.3f, 3.29f, 2.26f, 6.04f, 5.48f, 6.04f);
        d.horizontalLineToRelative(10.75f);
        d.curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(d, -0.34f, -0.75f, -0.75f, -0.75f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _attachment = build;
        build.getClass();
        return build;
    }
}
