package androidx.compose.material.icons.automirrored.twotone;

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
import defpackage.bv;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MergeTypeKt {
    private static ImageVector _mergeType;

    public static final ImageVector getMergeType(Icons.AutoMirrored.TwoTone twoTone) {
        ImageVector imageVector = _mergeType;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.TwoTone.MergeType", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(5.59f, 19.0f, 7.0f, 20.41f);
        i.lineToRelative(6.0f, -6.0f);
        i.lineTo(13.0f, 8.0f);
        i.horizontalLineToRelative(3.5f);
        i.lineTo(12.0f, 3.5f);
        i.lineTo(7.5f, 8.0f);
        bv.r(i, 11.0f, 8.0f, 5.59f);
        i.moveTo(16.997f, 20.41f);
        i.lineToRelative(-3.408f, -3.407f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(i, 1.4f, -1.407f, 3.41f, 3.408f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _mergeType = build;
        build.getClass();
        return build;
    }
}
