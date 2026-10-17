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
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class EditAttributesKt {
    private static ImageVector _editAttributes;

    public static final ImageVector getEditAttributes(Icons.Sharp sharp) {
        ImageVector imageVector = _editAttributes;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.EditAttributes", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(17.63f, 7.0f, 6.37f);
        d.curveTo(3.96f, 7.0f, 2.0f, 9.24f, 2.0f, 12.0f);
        d.reflectiveCurveToRelative(1.96f, 5.0f, 4.37f, 5.0f);
        d.horizontalLineToRelative(11.26f);
        d.curveToRelative(2.41f, 0.0f, 4.37f, -2.24f, 4.37f, -5.0f);
        d.reflectiveCurveToRelative(-1.96f, -5.0f, -4.37f, -5.0f);
        k4.x(d, 7.24f, 14.46f, -2.57f, -2.57f);
        d.lineToRelative(0.7f, -0.7f);
        d.lineToRelative(1.87f, 1.87f);
        d.lineToRelative(3.52f, -3.52f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(d, 0.7f, 0.7f, -4.22f, 4.22f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _editAttributes = build;
        build.getClass();
        return build;
    }
}
