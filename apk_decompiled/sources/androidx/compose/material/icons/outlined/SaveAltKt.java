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
import defpackage.bv;
import defpackage.gy;
import defpackage.kf0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SaveAltKt {
    private static ImageVector _saveAlt;

    public static final ImageVector getSaveAlt(Icons.Outlined outlined) {
        ImageVector imageVector = _saveAlt;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.SaveAlt", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder y = gy.y(19.0f, 12.0f, 7.0f, 5.0f, 19.0f);
        bv.q(y, -7.0f, 3.0f, 12.0f, 7.0f);
        y.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        y.horizontalLineToRelative(14.0f);
        y.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        kf0.C(y, -7.0f, -2.0f, 13.0f, 12.67f);
        y.lineToRelative(2.59f, -2.58f);
        y.lineTo(17.0f, 11.5f);
        y.lineToRelative(-5.0f, 5.0f);
        y.lineToRelative(-5.0f, -5.0f);
        y.lineToRelative(1.41f, -1.41f);
        y.lineTo(11.0f, 12.67f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.x(y, 11.0f, 3.0f, 2.0f, 9.67f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _saveAlt = build;
        build.getClass();
        return build;
    }
}
