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
import defpackage.fc;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AddPhotoAlternateKt {
    private static ImageVector _addPhotoAlternate;

    public static final ImageVector getAddPhotoAlternate(Icons.Outlined outlined) {
        ImageVector imageVector = _addPhotoAlternate;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.AddPhotoAlternate", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(18.0f, 20.0f, 4.0f, 20.0f);
        i.lineTo(4.0f, 6.0f);
        i.horizontalLineToRelative(9.0f);
        i.lineTo(13.0f, 4.0f);
        i.lineTo(4.0f, 4.0f);
        i.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        i.verticalLineToRelative(14.0f);
        i.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        i.horizontalLineToRelative(14.0f);
        i.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        r6.p(i, -9.0f, -2.0f, 9.0f);
        i.moveTo(10.21f, 16.83f);
        i.lineToRelative(-1.96f, -2.36f);
        i.lineTo(5.5f, 18.0f);
        uo.w(i, 11.0f, -3.54f, -4.71f);
        i.moveTo(20.0f, 4.0f);
        fc.w(i, 20.0f, 1.0f, -2.0f, 3.0f);
        i.horizontalLineToRelative(-3.0f);
        i.curveToRelative(0.01f, 0.01f, 0.0f, 2.0f, 0.0f, 2.0f);
        i.horizontalLineToRelative(3.0f);
        i.verticalLineToRelative(2.99f);
        i.curveToRelative(0.01f, 0.01f, 2.0f, 0.0f, 2.0f, 0.0f);
        i.lineTo(20.0f, 6.0f);
        i.horizontalLineToRelative(3.0f);
        i.lineTo(23.0f, 4.0f);
        i.horizontalLineToRelative(-3.0f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _addPhotoAlternate = build;
        build.getClass();
        return build;
    }
}
