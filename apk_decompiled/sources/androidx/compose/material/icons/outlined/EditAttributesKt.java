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
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class EditAttributesKt {
    private static ImageVector _editAttributes;

    public static final ImageVector getEditAttributes(Icons.Outlined outlined) {
        ImageVector imageVector = _editAttributes;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.EditAttributes", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
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
        k4.r(i, 17.63f, 15.0f, 6.37f, 15.0f);
        i.curveTo(5.09f, 15.0f, 4.0f, 13.63f, 4.0f, 12.0f);
        i.reflectiveCurveToRelative(1.09f, -3.0f, 2.37f, -3.0f);
        i.horizontalLineToRelative(11.26f);
        i.curveTo(18.91f, 9.0f, 20.0f, 10.37f, 20.0f, 12.0f);
        i.reflectiveCurveToRelative(-1.09f, 3.0f, -2.37f, 3.0f);
        k4.x(i, 7.24f, 13.06f, -1.87f, -1.87f);
        i.lineToRelative(-0.7f, 0.7f);
        i.lineToRelative(2.57f, 2.57f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(i, 4.22f, -4.22f, -0.7f, -0.7f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _editAttributes = build;
        build.getClass();
        return build;
    }
}
