package defpackage;

import androidx.compose.ui.graphics.vector.PathBuilder;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public abstract /* synthetic */ class c21 {
    public static String a(StringBuilder sb, String str, char c) {
        sb.append(str);
        sb.append(c);
        return sb.toString();
    }

    public static List b(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.verticalLineTo(f);
        pathBuilder.lineTo(f2, f3);
        pathBuilder.horizontalLineTo(f4);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static void c(PathBuilder pathBuilder, float f, float f2, float f3) {
        pathBuilder.verticalLineTo(f);
        pathBuilder.horizontalLineToRelative(f2);
        pathBuilder.verticalLineTo(f3);
        pathBuilder.close();
    }

    public static void d(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.close();
        pathBuilder.moveTo(f, f2);
        pathBuilder.horizontalLineTo(f3);
        pathBuilder.verticalLineTo(f4);
    }

    public static List e(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.horizontalLineTo(f);
        pathBuilder.verticalLineToRelative(f2);
        pathBuilder.horizontalLineToRelative(f3);
        pathBuilder.verticalLineTo(f4);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }
}
