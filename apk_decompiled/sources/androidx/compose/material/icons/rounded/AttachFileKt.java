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
import defpackage.af0;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AttachFileKt {
    private static ImageVector _attachFile;

    public static final ImageVector getAttachFile(Icons.Rounded rounded) {
        ImageVector imageVector = _attachFile;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.AttachFile", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder h = af0.h(16.5f, 6.75f, 10.58f);
        h.curveToRelative(0.0f, 2.09f, -1.53f, 3.95f, -3.61f, 4.15f);
        h.curveToRelative(-2.39f, 0.23f, -4.39f, -1.64f, -4.39f, -3.98f);
        h.verticalLineTo(5.14f);
        h.curveToRelative(0.0f, -1.31f, 0.94f, -2.5f, 2.24f, -2.63f);
        h.curveToRelative(1.5f, -0.15f, 2.76f, 1.02f, 2.76f, 2.49f);
        h.verticalLineToRelative(10.5f);
        h.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        h.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        h.verticalLineTo(6.75f);
        h.curveToRelative(0.0f, -0.41f, -0.34f, -0.75f, -0.75f, -0.75f);
        h.reflectiveCurveToRelative(-0.75f, 0.34f, -0.75f, 0.75f);
        h.verticalLineToRelative(8.61f);
        h.curveToRelative(0.0f, 1.31f, 0.94f, 2.5f, 2.24f, 2.63f);
        h.curveToRelative(1.5f, 0.15f, 2.76f, -1.02f, 2.76f, -2.49f);
        h.verticalLineTo(5.17f);
        h.curveToRelative(0.0f, -2.09f, -1.53f, -3.95f, -3.61f, -4.15f);
        h.curveTo(9.01f, 0.79f, 7.0f, 2.66f, 7.0f, 5.0f);
        h.verticalLineToRelative(12.27f);
        h.curveToRelative(0.0f, 2.87f, 2.1f, 5.44f, 4.96f, 5.71f);
        h.curveToRelative(3.29f, 0.3f, 6.04f, -2.26f, 6.04f, -5.48f);
        h.verticalLineTo(6.75f);
        h.curveToRelative(0.0f, -0.41f, -0.34f, -0.75f, -0.75f, -0.75f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(h, -0.75f, 0.34f, -0.75f, 0.75f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _attachFile = build;
        build.getClass();
        return build;
    }
}
