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
import defpackage.k4;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SignpostKt {
    private static ImageVector _signpost;

    public static final ImageVector getSignpost(Icons.Outlined outlined) {
        ImageVector imageVector = _signpost;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Signpost", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = uo.i(13.0f, 10.0f, 5.0f, 3.0f, -3.0f);
        fc.r(i, -3.0f, -3.0f, -5.0f, 2.0f);
        af0.z(i, -2.0f, 2.0f, 4.0f, 6.0f);
        k4.k(i, 7.0f, 2.0f, 6.0f);
        i.lineToRelative(-3.0f, 3.0f);
        r6.q(i, 3.0f, 3.0f, 5.0f, 4.0f);
        af0.v(i, 2.0f, -4.0f, 7.0f, -6.0f);
        uo.r(i, -7.0f, 10.0f, 6.0f, 6.0f);
        i.horizontalLineToRelative(11.17f);
        i.lineToRelative(1.0f, 1.0f);
        i.lineToRelative(-1.0f, 1.0f);
        i.horizontalLineTo(6.0f);
        i.verticalLineTo(6.0f);
        i.close();
        i.moveTo(18.0f, 16.0f);
        i.horizontalLineTo(6.83f);
        i.lineToRelative(-1.0f, -1.0f);
        i.lineToRelative(1.0f, -1.0f);
        i.horizontalLineTo(18.0f);
        i.verticalLineTo(16.0f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _signpost = build;
        build.getClass();
        return build;
    }
}
