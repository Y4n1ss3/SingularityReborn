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
import defpackage.k4;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class EditAttributesKt {
    private static ImageVector _editAttributes;

    public static final ImageVector getEditAttributes(Icons.Rounded rounded) {
        ImageVector imageVector = _editAttributes;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.EditAttributes", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(17.63f, 7.0f, 6.37f, 7.0f);
        i.curveTo(3.96f, 7.0f, 2.0f, 9.24f, 2.0f, 12.0f);
        i.reflectiveCurveToRelative(1.96f, 5.0f, 4.37f, 5.0f);
        i.horizontalLineToRelative(11.26f);
        i.curveToRelative(2.41f, 0.0f, 4.37f, -2.24f, 4.37f, -5.0f);
        i.reflectiveCurveToRelative(-1.96f, -5.0f, -4.37f, -5.0f);
        k4.r(i, 11.11f, 10.6f, 7.6f, 14.11f);
        i.curveToRelative(-0.1f, 0.1f, -0.23f, 0.15f, -0.35f, 0.15f);
        i.reflectiveCurveToRelative(-0.26f, -0.05f, -0.35f, -0.15f);
        i.lineToRelative(-1.86f, -1.86f);
        i.curveToRelative(-0.2f, -0.2f, -0.2f, -0.51f, 0.0f, -0.71f);
        i.reflectiveCurveToRelative(0.51f, -0.2f, 0.71f, 0.0f);
        i.lineToRelative(1.51f, 1.51f);
        i.lineToRelative(3.16f, -3.16f);
        i.curveToRelative(0.2f, -0.2f, 0.51f, -0.2f, 0.71f, 0.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(i, 0.17f, 0.51f, -0.02f, 0.71f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _editAttributes = build;
        build.getClass();
        return build;
    }
}
