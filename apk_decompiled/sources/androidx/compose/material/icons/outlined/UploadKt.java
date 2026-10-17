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
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class UploadKt {
    private static ImageVector _upload;

    public static final ImageVector getUpload(Icons.Outlined outlined) {
        ImageVector imageVector = _upload;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Upload", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder n = k4.n(9.0f, 16.0f, 6.0f, -6.0f, 4.0f);
        n.lineToRelative(-7.0f, -7.0f);
        n.lineToRelative(-7.0f, 7.0f);
        n.horizontalLineToRelative(4.0f);
        n.verticalLineToRelative(6.0f);
        n.close();
        n.moveTo(12.0f, 5.83f);
        n.lineTo(14.17f, 8.0f);
        af0.m(n, 13.0f, 8.0f, 6.0f, -2.0f);
        n.lineTo(11.0f, 8.0f);
        r6.C(n, 9.83f, 8.0f, 12.0f, 5.83f);
        k4.C(n, 5.0f, 18.0f, 14.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(n, 5.0f, 20.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _upload = build;
        build.getClass();
        return build;
    }
}
